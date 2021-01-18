package com.elihuang.btctrademachine.client;


import com.elihuang.btctrademachine.client.req.generic.CurrencyChainsRequest;
import com.elihuang.btctrademachine.constant.Options;
import com.elihuang.btctrademachine.constant.enums.ExchangeEnum;
import com.elihuang.btctrademachine.exception.SDKException;
import com.elihuang.btctrademachine.huobi.HuobiGenericService;
import com.elihuang.btctrademachine.model.generic.CurrencyChain;
import com.elihuang.btctrademachine.model.generic.MarketStatus;
import com.elihuang.btctrademachine.model.generic.Symbol;

import java.util.List;

public interface GenericClient {

  String getSystemStatus();

  MarketStatus getMarketStatus();

  List<Symbol> getSymbols();

  List<String> getCurrencys();

  List<CurrencyChain> getCurrencyChains(CurrencyChainsRequest request);

  Long getTimestamp();

  static GenericClient create(Options options) {

    if (options.getExchange().equals(ExchangeEnum.HUOBI)) {
      return new HuobiGenericService(options);
    }
    throw new SDKException(SDKException.INPUT_ERROR, "Unsupport Exchange.");
  }
}
