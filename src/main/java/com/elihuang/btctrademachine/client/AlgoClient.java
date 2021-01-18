package com.elihuang.btctrademachine.client;

import com.elihuang.btctrademachine.client.req.algo.CancelAlgoOrderRequest;
import com.elihuang.btctrademachine.client.req.algo.CreateAlgoOrderRequest;
import com.elihuang.btctrademachine.client.req.algo.GetHistoryAlgoOrdersRequest;
import com.elihuang.btctrademachine.client.req.algo.GetOpenAlgoOrdersRequest;
import com.elihuang.btctrademachine.constant.Options;
import com.elihuang.btctrademachine.constant.enums.ExchangeEnum;
import com.elihuang.btctrademachine.exception.SDKException;
import com.elihuang.btctrademachine.huobi.HuobiAlgoService;
import com.elihuang.btctrademachine.model.algo.*;

public interface AlgoClient {

  CreateAlgoOrderResult createAlgoOrder(CreateAlgoOrderRequest request);

  CancelAlgoOrderResult cancelAlgoOrder(CancelAlgoOrderRequest request);

  GetOpenAlgoOrdersResult getOpenAlgoOrders(GetOpenAlgoOrdersRequest request);

  GetHistoryAlgoOrdersResult getHistoryAlgoOrders(GetHistoryAlgoOrdersRequest request);

  AlgoOrder getAlgoOrdersSpecific(String clientOrderId);


  static AlgoClient create(Options options) {

    if (options.getExchange().equals(ExchangeEnum.HUOBI)) {
      return new HuobiAlgoService(options);
    }
    throw new SDKException(SDKException.INPUT_ERROR, "Unsupport Exchange.");
  }
}
