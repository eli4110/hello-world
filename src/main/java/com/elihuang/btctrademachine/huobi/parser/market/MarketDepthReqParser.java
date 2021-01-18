package com.elihuang.btctrademachine.huobi.parser.market;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.huobi.utils.DataUtils;
import com.elihuang.btctrademachine.model.market.MarketDepthReq;

import java.util.List;


public class MarketDepthReqParser implements HuobiModelParser<MarketDepthReq> {

  @Override
  public MarketDepthReq parse(JSONObject json) {
    String dataKey = DataUtils.getDataKey(json);
    return MarketDepthReq.builder()
        .ch(json.getString("ch"))
        .ts(json.getLong("ts"))
        .depth(new MarketDepthParser().parse(json.getJSONObject(dataKey)))
        .build();
  }

  @Override
  public MarketDepthReq parse(JSONArray json) {
    return null;
  }

  @Override
  public List<MarketDepthReq> parseArray(JSONArray jsonArray) {
    return null;
  }
}
