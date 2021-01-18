package com.elihuang.btctrademachine.constant;


import com.elihuang.btctrademachine.constant.enums.ExchangeEnum;

public interface Options {

  String getApiKey();

  String getSecretKey();

  ExchangeEnum getExchange();

  String getRestHost();

  String getWebSocketHost();

  boolean isWebSocketAutoConnect();

}
