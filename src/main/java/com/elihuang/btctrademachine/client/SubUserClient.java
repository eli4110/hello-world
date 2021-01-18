package com.elihuang.btctrademachine.client;

import com.elihuang.btctrademachine.client.req.account.TransferSubuserRequest;
import com.elihuang.btctrademachine.client.req.subuser.*;
import com.elihuang.btctrademachine.constant.Options;
import com.elihuang.btctrademachine.constant.enums.ExchangeEnum;
import com.elihuang.btctrademachine.exception.SDKException;
import com.elihuang.btctrademachine.huobi.HuobiSubUserService;
import com.elihuang.btctrademachine.model.account.AccountBalance;
import com.elihuang.btctrademachine.model.account.SubuserAggregateBalance;
import com.elihuang.btctrademachine.model.subuser.*;
import com.elihuang.btctrademachine.model.wallet.DepositAddress;

import java.util.List;

public interface SubUserClient {


  List<SubUserCreationInfo> subuserCreation(SubUserCreationRequest request);


  GetSubUserListResult getSubUserList(GetSubUserListRequest request);

  SubUserState getSubuserState(Long subUid);

  SubUserManagementResult subuserManagement(SubUserManagementRequest request);

  GetSubUserAccountListResult getSubuserAccountList(GetSubUserAccountListRequest request);

  SubUserTransferabilityResult subuserTransferability(SubUserTransferabilityRequest request);

  SubUserTradableMarketResult subuserTradableMarket(SubUserTradableMarketRequest request);

  SubUserApiKeyGenerationResult subuserApiKeyGeneration(SubUserApiKeyGenerationRequest request);

  SubUserApiKeyModificationResult subuserApiKeyModification(SubUserApiKeyModificationRequest request);

  void subuserApiKeyDeletion(SubUserApiKeyDeletionRequest request);

  GetApiKeyListResult getApiKeyList(GetApiKeyListRequest request);

  List<DepositAddress> getSubUserDepositAddress(Long subUid, String currency);

  GetSubUserDepositResult getSubUserDeposit(GetSubUserDepositRequest request);
  /**
   * Transfer to sub-user
   * @param request
   * @return
   */
  long transferSubuser(TransferSubuserRequest request);

  /**
   * Get sub-user's account balance
   * @param subuserId
   * @return
   */
  List<AccountBalance> getSubuserAccountBalance(Long subuserId);

  /**
   * Get the aggregated balance of all sub-accounts of the current user.
   * @return
   */
  List<SubuserAggregateBalance> getSubuserAggregateBalance();

  static SubUserClient create(Options options) {

    if (options.getExchange().equals(ExchangeEnum.HUOBI)) {
      return new HuobiSubUserService(options);
    }
    throw new SDKException(SDKException.INPUT_ERROR, "Unsupport Exchange.");
  }

  long getUid();
}
