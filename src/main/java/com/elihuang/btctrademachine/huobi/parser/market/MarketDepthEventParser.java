package com.elihuang.btctrademachine.huobi.parser.market;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.huobi.utils.DataUtils;
import com.elihuang.btctrademachine.model.market.MarketDepthEvent;

import java.util.List;


public class MarketDepthEventParser implements HuobiModelParser<MarketDepthEvent> {

  @Override
  public MarketDepthEvent parse(JSONObject json) {
    String dataKey = DataUtils.getDataKey(json);
    return MarketDepthEvent.builder()
        .ch(json.getString("ch"))
        .ts(json.getLong("ts"))
        .depth(new MarketDepthParser().parse(json.getJSONObject(dataKey)))
        .build();
  }

  @Override
  public MarketDepthEvent parse(JSONArray json) {
    return null;
  }

  @Override
  public List<MarketDepthEvent> parseArray(JSONArray jsonArray) {
    return null;
  }
}
