package com.elihuang.btctrademachine.huobi.parser.market;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.market.MarketDetail;

import java.util.List;


public class MarketDetailParser implements HuobiModelParser<MarketDetail> {

  @Override
  public MarketDetail parse(JSONObject json) {
    return json.toJavaObject(MarketDetail.class);
  }

  @Override
  public MarketDetail parse(JSONArray json) {
    return null;
  }

  @Override
  public List<MarketDetail> parseArray(JSONArray jsonArray) {
    return null;
  }
}
