package com.elihuang.btctrademachine.huobi.parser.trade;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.trade.TradeClearing;

import java.util.List;


public class TradeClearingParser implements HuobiModelParser<TradeClearing> {

  @Override
  public TradeClearing parse(JSONObject json) {
    return json.toJavaObject(TradeClearing.class);
  }

  @Override
  public TradeClearing parse(JSONArray json) {
    return null;
  }

  @Override
  public List<TradeClearing> parseArray(JSONArray jsonArray) {
    return null;
  }
}
