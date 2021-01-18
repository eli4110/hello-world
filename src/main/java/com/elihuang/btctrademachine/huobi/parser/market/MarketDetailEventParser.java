package com.elihuang.btctrademachine.huobi.parser.market;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.huobi.utils.DataUtils;
import com.elihuang.btctrademachine.model.market.MarketDetail;
import com.elihuang.btctrademachine.model.market.MarketDetailEvent;

import java.util.List;

public class MarketDetailEventParser implements HuobiModelParser<MarketDetailEvent> {

  @Override
  public MarketDetailEvent parse(JSONObject json) {
    String dataKey = DataUtils.getDataKey(json);

    JSONObject data = json.getJSONObject(dataKey);
    MarketDetail marketDetail = new MarketDetailParser().parse(data);
    return MarketDetailEvent.builder()
        .ch(json.getString("ch"))
        .ts(json.getLong("ts"))
        .detail(marketDetail)
        .build();
  }

  @Override
  public MarketDetailEvent parse(JSONArray json) {
    return null;
  }

  @Override
  public List<MarketDetailEvent> parseArray(JSONArray jsonArray) {
    return null;
  }
}
