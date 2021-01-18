package com.elihuang.btctrademachine.huobi;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.client.GenericClient;
import com.elihuang.btctrademachine.client.req.generic.CurrencyChainsRequest;
import com.elihuang.btctrademachine.constant.Options;
import com.elihuang.btctrademachine.huobi.connection.HuobiRestConnection;
import com.elihuang.btctrademachine.huobi.parser.generic.CurrencyChainParser;
import com.elihuang.btctrademachine.huobi.parser.generic.MarketStatusParser;
import com.elihuang.btctrademachine.huobi.parser.generic.SymbolParser;
import com.elihuang.btctrademachine.huobi.signature.UrlParamsBuilder;
import com.elihuang.btctrademachine.model.generic.CurrencyChain;
import com.elihuang.btctrademachine.model.generic.MarketStatus;
import com.elihuang.btctrademachine.model.generic.Symbol;

import java.util.List;


public class HuobiGenericService implements GenericClient {

  public static final String GET_SYSTEM_STATUS_URL = "https://status.huobigroup.com/api/v2/summary.json";

  public static final String GET_MARKET_STATUS_PATH = "/v2/market-status";
  public static final String GET_SYMBOLS_PATH = "/v1/common/symbols";
  public static final String GET_CURRENCY_PATH = "/v1/common/currencys";
  public static final String GET_CURRENCY_CHAINS_PATH = "/v2/reference/currencies";
  public static final String GET_TIMESTAMP = "/v1/common/timestamp";

  private Options options;

  private HuobiRestConnection restConnection;

  public HuobiGenericService(Options options) {
    this.options = options;
    restConnection = new HuobiRestConnection(options);
  }

  @Override
  public String getSystemStatus() {
    String response = restConnection.executeGetString(GET_SYSTEM_STATUS_URL, UrlParamsBuilder.build());
    return response;
  }

  @Override
  public MarketStatus getMarketStatus() {
    JSONObject jsonObject = restConnection.executeGet(GET_MARKET_STATUS_PATH, UrlParamsBuilder.build());
    JSONObject data = jsonObject.getJSONObject("data");
    return new MarketStatusParser().parse(data);
  }

  @Override
  public List<Symbol> getSymbols() {

    JSONObject jsonObject = restConnection.executeGet(GET_SYMBOLS_PATH, UrlParamsBuilder.build());
    JSONArray data = jsonObject.getJSONArray("data");
    return new SymbolParser().parseArray(data);
  }

  @Override
  public List<String> getCurrencys() {

    JSONObject jsonObject = restConnection.executeGet(GET_CURRENCY_PATH, UrlParamsBuilder.build());
    JSONArray data = jsonObject.getJSONArray("data");
    return data.toJavaList(String.class);

  }

  @Override
  public List<CurrencyChain> getCurrencyChains(CurrencyChainsRequest request) {

    UrlParamsBuilder builder = UrlParamsBuilder.build()
        .putToUrl("currency",request.getCurrency())
        .putToUrl("authorizedUser",request.isAuthorizedUser()+"");

    JSONObject jsonObject = restConnection.executeGet(GET_CURRENCY_CHAINS_PATH,builder);
    JSONArray data = jsonObject.getJSONArray("data");
    return new CurrencyChainParser().parseArray(data);
  }

  @Override
  public Long getTimestamp() {
    JSONObject jsonObject = restConnection.executeGet(GET_TIMESTAMP, UrlParamsBuilder.build());
    return jsonObject.getLong("data");
  }

}
