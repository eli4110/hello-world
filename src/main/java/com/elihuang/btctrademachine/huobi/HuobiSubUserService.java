package com.elihuang.btctrademachine.huobi;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.client.SubUserClient;
import com.elihuang.btctrademachine.client.req.account.TransferSubuserRequest;
import com.elihuang.btctrademachine.client.req.subuser.*;
import com.elihuang.btctrademachine.constant.Options;
import com.elihuang.btctrademachine.huobi.connection.HuobiRestConnection;
import com.elihuang.btctrademachine.huobi.parser.account.AccountBalanceParser;
import com.elihuang.btctrademachine.huobi.parser.account.SubuserAggregateBalanceParser;
import com.elihuang.btctrademachine.huobi.parser.subuser.*;
import com.elihuang.btctrademachine.huobi.parser.wallet.DepositAddressParser;
import com.elihuang.btctrademachine.huobi.signature.UrlParamsBuilder;
import com.elihuang.btctrademachine.model.account.AccountBalance;
import com.elihuang.btctrademachine.model.account.SubuserAggregateBalance;
import com.elihuang.btctrademachine.model.subuser.*;
import com.elihuang.btctrademachine.model.wallet.DepositAddress;
import com.elihuang.btctrademachine.utils.InputChecker;

import java.util.List;

public class HuobiSubUserService implements SubUserClient {

  public static final String GET_SUBUSER_ACCOUNT_BALANCE_PATH = "/v1/account/accounts/{sub-uid}";
  public static final String GET_SUBUSER_AGGREGATE_BALANCE_PATH = "/v1/subuser/aggregate-balance";
  public static final String TRANSFER_SUBUSER_PATH = "/v1/subuser/transfer";

  public static final String SUBUSER_CREATION_PATH = "/v2/sub-user/creation";
  public static final String GET_SUBUSER_LIST_PATH = "/v2/sub-user/user-list";
  public static final String GET_SUBUSER_STATE_PATH = "/v2/sub-user/user-state";
  public static final String SUBUSER_MANAGEMENT_PATH = "/v2/sub-user/management";
  public static final String GET_SUBUSER_ACCOUNT_LIST_PATH = "/v2/sub-user/account-list";
  public static final String SUBUSER_TRANSFERABILITY_PATH = "/v2/sub-user/transferability";
  public static final String SUBUSER_TRADABLE_MARKET_PATH = "/v2/sub-user/tradable-market";
  public static final String SUBUSER_APIKEY_GENERATION_PATH = "/v2/sub-user/api-key-generation";
  public static final String SUBUSER_APIKEY_MODIFICATION_PATH = "/v2/sub-user/api-key-modification";
  public static final String SUBUSER_APIKEY_DELETION_PATH = "/v2/sub-user/api-key-deletion";
  public static final String GET_SUBUSER_APIKEY_PATH = "/v2/user/api-key";
  public static final String GET_SUBUSER_DEPOSIT_ADDRESS_PATH = "/v2/sub-user/deposit-address";
  public static final String GET_SUBUSER_DEPOSIT_PATH = "/v2/sub-user/query-deposit";
  public static final String GET_UID_PATH = "/v2/user/uid";


  private Options options;

  private HuobiRestConnection restConnection;

  public HuobiSubUserService(Options options) {
    this.options = options;
    this.restConnection = new HuobiRestConnection(options);
  }

  @Override
  public List<SubUserCreationInfo> subuserCreation(SubUserCreationRequest request) {

    InputChecker checker = InputChecker.checker().checkList(request.getUserList(), 1, 50, "userList");
    request.getUserList().forEach(param -> {
      checker.shouldNotNull(param.getUserName(), "userName");
    });

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToPost("userList", request.getUserList());

    JSONObject jsonObject = restConnection.executePostWithSignature(SUBUSER_CREATION_PATH, builder);
    JSONArray jsonArray = jsonObject.getJSONArray("data");
    return new SubUserCreationInfoParser().parseArray(jsonArray);
  }

  @Override
  public GetSubUserListResult getSubUserList(GetSubUserListRequest request) {

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToUrl("fromId", request.getFromId());

    JSONObject jsonObject = restConnection.executeGetWithSignature(GET_SUBUSER_LIST_PATH, builder);
    return new GetSubUserListResultParser().parse(jsonObject);
  }

  @Override
  public SubUserState getSubuserState(Long subUid) {

    InputChecker.checker().shouldNotNull(subUid, "subUid");
    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToUrl("subUid", subUid);

    JSONObject jsonObject = restConnection.executeGetWithSignature(GET_SUBUSER_STATE_PATH, builder);
    JSONObject data = jsonObject.getJSONObject("data");
    return new SubUserStateParser().parse(data);
  }

  @Override
  public SubUserManagementResult subuserManagement(SubUserManagementRequest request) {

    InputChecker.checker()
        .shouldNotNull(request.getSubUid(), "subUid")
        .shouldNotNull(request.getAction(), "action");

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToPost("subUid", request.getSubUid())
        .putToPost("action", request.getAction().getAction());

    JSONObject jsonObject = restConnection.executePostWithSignature(SUBUSER_MANAGEMENT_PATH, builder);
    JSONObject data = jsonObject.getJSONObject("data");
    return new SubUserManagementResultParser().parse(data);
  }

  @Override
  public GetSubUserAccountListResult getSubuserAccountList(GetSubUserAccountListRequest request) {
    InputChecker.checker()
        .shouldNotNull(request.getSubUid(), "subUid");

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToUrl("subUid", request.getSubUid());

    JSONObject jsonObject = restConnection.executeGetWithSignature(GET_SUBUSER_ACCOUNT_LIST_PATH, builder);
    JSONObject data = jsonObject.getJSONObject("data");
    return new GetSubUserAccountListResultParser().parse(data);
  }

  @Override
  public SubUserTransferabilityResult subuserTransferability(SubUserTransferabilityRequest request) {
    InputChecker.checker()
        .shouldNotNull(request.getSubUids(), "subUids")
        .shouldNotNull(request.getTransferrable(), "transferrable");

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToPost("subUids", request.getSubUids())
        .putToPost("accountType", request.getAccountType().getAccountType())
        .putToPost("transferrable", request.getTransferrable());

    JSONObject jsonObject = restConnection.executePostWithSignature(SUBUSER_TRANSFERABILITY_PATH, builder);
    return new SubUserTransferabilityResultParser().parse(jsonObject);
  }

  @Override
  public SubUserTradableMarketResult subuserTradableMarket(SubUserTradableMarketRequest request) {
    InputChecker.checker()
        .shouldNotNull(request.getSubUids(), "subUids")
        .shouldNotNull(request.getAccountType(), "accountType")
        .shouldNotNull(request.getActivation(), "activation");

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToPost("subUids", request.getSubUids())
        .putToPost("accountType", request.getAccountType().getAccountType())
        .putToPost("activation", request.getActivation().getActivation());

    JSONObject jsonObject = restConnection.executePostWithSignature(SUBUSER_TRADABLE_MARKET_PATH, builder);
    return new SubUserTradableMarketResultParser().parse(jsonObject);
  }

  @Override
  public SubUserApiKeyGenerationResult subuserApiKeyGeneration(SubUserApiKeyGenerationRequest request) {
    InputChecker.checker()
        .shouldNotNull(request.getOtpToken(), "otpToken")
        .shouldNotNull(request.getSubUid(), "subUid")
        .shouldNotNull(request.getNote(), "note")
        .shouldNotNull(request.getPermission(), "permission");

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToPost("otpToken", request.getOtpToken())
        .putToPost("subUid", request.getSubUid())
        .putToPost("note", request.getNote())
        .putToPost("permission", request.getPermission())
        .putToPost("ipAddresses", request.getIpAddresses());

    JSONObject jsonObject = restConnection.executePostWithSignature(SUBUSER_APIKEY_GENERATION_PATH, builder);
    JSONObject data = jsonObject.getJSONObject("data");
    return new SubUserApiKeyGenerationResultParser().parse(data);
  }

  @Override
  public SubUserApiKeyModificationResult subuserApiKeyModification(SubUserApiKeyModificationRequest request) {
    InputChecker.checker()
        .shouldNotNull(request.getAccessKey(), "accessKey")
        .shouldNotNull(request.getSubUid(), "subUid");

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToPost("accessKey", request.getAccessKey())
        .putToPost("subUid", request.getSubUid())
        .putToPost("note", request.getNote())
        .putToPost("permission", request.getPermission())
        .putToPost("ipAddresses", request.getIpAddresses());

    JSONObject jsonObject = restConnection.executePostWithSignature(SUBUSER_APIKEY_MODIFICATION_PATH, builder);
    JSONObject data = jsonObject.getJSONObject("data");
    return new SubUserApiKeyModificationResultParser().parse(data);
  }

  @Override
  public void subuserApiKeyDeletion(SubUserApiKeyDeletionRequest request) {
    InputChecker.checker()
        .shouldNotNull(request.getAccessKey(), "accessKey")
        .shouldNotNull(request.getSubUid(), "subUid");

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToPost("accessKey", request.getAccessKey())
        .putToPost("subUid", request.getSubUid());

    restConnection.executePostWithSignature(SUBUSER_APIKEY_DELETION_PATH, builder);
  }

  @Override
  public GetApiKeyListResult getApiKeyList(GetApiKeyListRequest request) {
    InputChecker.checker()
        .shouldNotNull(request.getUid(), "uid");

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToUrl("uid", request.getUid())
        .putToUrl("accessKey", request.getAccessKey());

    JSONObject jsonObject = restConnection.executeGetWithSignature(GET_SUBUSER_APIKEY_PATH, builder);
    return new GetApiKeyListResultParser().parse(jsonObject);
  }

  @Override
  public List<DepositAddress> getSubUserDepositAddress(Long subUid, String currency) {

    InputChecker.checker()
        .shouldNotNull(subUid, "subUid")
        .checkCurrency(currency);
    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToUrl("subUid", subUid)
        .putToUrl("currency", currency);

    JSONObject jsonObject = restConnection.executeGetWithSignature(GET_SUBUSER_DEPOSIT_ADDRESS_PATH, builder);

    JSONArray array = jsonObject.getJSONArray("data");
    return new DepositAddressParser().parseArray(array);
  }

  @Override
  public GetSubUserDepositResult getSubUserDeposit(GetSubUserDepositRequest request) {

    InputChecker.checker()
        .shouldNotNull(request.getSubUid(), "subUid");

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToUrl("subUid", request.getSubUid())
        .putToUrl("currency", request.getCurrency())
        .putToUrl("startTime", request.getStartTime())
        .putToUrl("endTime", request.getEndTime())
        .putToUrl("sort", request.getSort() == null ? null : request.getSort().getSort())
        .putToUrl("limit", request.getLimit())
        .putToUrl("fromId", request.getFromId());

    JSONObject jsonObject = restConnection.executeGetWithSignature(GET_SUBUSER_DEPOSIT_PATH, builder);
    return new GetSubUserDepositResultParser().parse(jsonObject);
  }

  @Override
  public long transferSubuser(TransferSubuserRequest request) {

    InputChecker.checker()
        .shouldNotNull(request.getSubUid(), "sub-uid")
        .shouldNotNull(request.getCurrency(), "currency")
        .shouldNotNull(request.getAmount(), "amount")
        .shouldNotNull(request.getType(), "type");

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToPost("sub-uid", request.getSubUid())
        .putToPost("currency", request.getCurrency())
        .putToPost("amount", request.getAmount().toPlainString())
        .putToPost("type", request.getType().getCode());

    JSONObject jsonObject = restConnection.executePostWithSignature(TRANSFER_SUBUSER_PATH, builder);
    return jsonObject.getLong("data");
  }

  @Override
  public List<AccountBalance> getSubuserAccountBalance(Long subuserId) {

    InputChecker.checker()
        .shouldNotNull(subuserId, "sub-uid");

    String path = GET_SUBUSER_ACCOUNT_BALANCE_PATH.replace("{sub-uid}", subuserId + "");
    JSONObject jsonObject = restConnection.executeGetWithSignature(path, UrlParamsBuilder.build());
    JSONArray data = jsonObject.getJSONArray("data");
    return new AccountBalanceParser().parseArray(data);
  }

  @Override
  public List<SubuserAggregateBalance> getSubuserAggregateBalance() {

    JSONObject jsonObject = restConnection.executeGetWithSignature(GET_SUBUSER_AGGREGATE_BALANCE_PATH, UrlParamsBuilder.build());
    JSONArray data = jsonObject.getJSONArray("data");
    return new SubuserAggregateBalanceParser().parseArray(data);

  }

  @Override
  public long getUid() {
    JSONObject jsonObject = restConnection.executeGetWithSignature(GET_UID_PATH, UrlParamsBuilder.build());
    long data = jsonObject.getLong("data");
    return data;
  }

}
