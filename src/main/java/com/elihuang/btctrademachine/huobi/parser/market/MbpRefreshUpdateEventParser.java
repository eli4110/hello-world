package com.elihuang.btctrademachine.huobi.parser.market;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.huobi.utils.DataUtils;
import com.elihuang.btctrademachine.model.market.MbpRefreshUpdateEvent;

import java.util.List;


public class MbpRefreshUpdateEventParser implements HuobiModelParser<MbpRefreshUpdateEvent> {

  @Override
  public MbpRefreshUpdateEvent parse(JSONObject json) {
    String dataKey = DataUtils.getDataKey(json);

    JSONObject data = json.getJSONObject(dataKey);

    return MbpRefreshUpdateEvent.builder()
        .topic(json.getString("ch"))
        .ts(json.getLong("ts"))
        .seqNum(data.getLong("seqNum"))
        .bids(new PriceLevelParser().parseArray(data.getJSONArray("bids")))
        .asks(new PriceLevelParser().parseArray(data.getJSONArray("asks")))
        .build();
  }

  @Override
  public MbpRefreshUpdateEvent parse(JSONArray json) {
    return null;
  }

  @Override
  public List<MbpRefreshUpdateEvent> parseArray(JSONArray jsonArray) {
    return null;
  }
}
