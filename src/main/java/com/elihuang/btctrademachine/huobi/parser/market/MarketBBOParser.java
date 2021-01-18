package com.elihuang.btctrademachine.huobi.parser.market;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.market.MarketBBO;

import java.util.List;


public class MarketBBOParser implements HuobiModelParser<MarketBBO> {

  @Override
  public MarketBBO parse(JSONObject json) {
    return json.toJavaObject(MarketBBO.class);
  }

  @Override
  public MarketBBO parse(JSONArray json) {
    return null;
  }

  @Override
  public List<MarketBBO> parseArray(JSONArray jsonArray) {
    return null;
  }
}
