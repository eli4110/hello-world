package com.elihuang.btctrademachine.huobi.parser.market;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.huobi.utils.DataUtils;
import com.elihuang.btctrademachine.model.market.MarketTradeEvent;

import java.util.List;


public class MarketTradeEventParser implements HuobiModelParser<MarketTradeEvent> {

  @Override
  public MarketTradeEvent parse(JSONObject json) {
    String dataKey = DataUtils.getDataKey(json);

    JSONObject data = json.getJSONObject(dataKey);
    JSONArray dataArray = data.getJSONArray("data");

    return MarketTradeEvent.builder()
        .ch(json.getString("ch"))
        .ts(json.getLong("ts"))
        .list(new MarketTradeParser().parseArray(dataArray))
        .build();
  }

  @Override
  public MarketTradeEvent parse(JSONArray json) {
    return null;
  }

  @Override
  public List<MarketTradeEvent> parseArray(JSONArray jsonArray) {
    return null;
  }
}
