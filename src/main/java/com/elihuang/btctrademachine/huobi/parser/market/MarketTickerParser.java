package com.elihuang.btctrademachine.huobi.parser.market;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.market.MarketTicker;

import java.util.ArrayList;
import java.util.List;

public class MarketTickerParser implements HuobiModelParser<MarketTicker> {

  @Override
  public MarketTicker parse(JSONObject json) {
    return json.toJavaObject(MarketTicker.class);
  }

  @Override
  public MarketTicker parse(JSONArray json) {
    return null;
  }

  @Override
  public List<MarketTicker> parseArray(JSONArray jsonArray) {
    if (jsonArray == null || jsonArray.size() <= 0) {
      return new ArrayList<>();
    }

    return jsonArray.toJavaList(MarketTicker.class);
  }
}
