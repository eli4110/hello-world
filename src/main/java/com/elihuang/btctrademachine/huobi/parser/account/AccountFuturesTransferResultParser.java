package com.elihuang.btctrademachine.huobi.parser.account;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.account.AccountFuturesTransferResult;

import java.util.List;


public class AccountFuturesTransferResultParser implements HuobiModelParser<AccountFuturesTransferResult> {

  @Override
  public AccountFuturesTransferResult parse(JSONObject json) {
    return AccountFuturesTransferResult.builder().data(json.getLong("data")).build();
  }

  @Override
  public AccountFuturesTransferResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<AccountFuturesTransferResult> parseArray(JSONArray jsonArray) {
    return null;
  }
}
