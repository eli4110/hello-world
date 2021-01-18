package com.elihuang.btctrademachine.huobi.parser.generic;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.generic.MarketStatus;

import java.util.List;


public class MarketStatusParser implements HuobiModelParser<MarketStatus> {

  @Override
  public MarketStatus parse(JSONObject json) {
    return json.toJavaObject(MarketStatus.class);
  }

  @Override
  public MarketStatus parse(JSONArray json) {
    return null;
  }

  @Override
  public List<MarketStatus> parseArray(JSONArray jsonArray) {
    return null;
  }
}
