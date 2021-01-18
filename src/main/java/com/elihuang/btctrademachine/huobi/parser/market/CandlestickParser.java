package com.elihuang.btctrademachine.huobi.parser.market;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.market.Candlestick;

import java.util.List;


public class CandlestickParser implements HuobiModelParser<Candlestick> {

  @Override
  public Candlestick parse(JSONObject json) {
    return json.toJavaObject(Candlestick.class);
  }

  @Override
  public Candlestick parse(JSONArray json) {
    return null;
  }

  @Override
  public List<Candlestick> parseArray(JSONArray jsonArray) {
    return jsonArray.toJavaList(Candlestick.class);
  }
}
