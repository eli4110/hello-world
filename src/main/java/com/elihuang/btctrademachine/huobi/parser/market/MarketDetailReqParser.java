package com.elihuang.btctrademachine.huobi.parser.market;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.huobi.utils.DataUtils;
import com.elihuang.btctrademachine.model.market.MarketDetail;
import com.elihuang.btctrademachine.model.market.MarketDetailReq;

import java.util.List;


public class MarketDetailReqParser implements HuobiModelParser<MarketDetailReq> {

  @Override
  public MarketDetailReq parse(JSONObject json) {
    String dataKey = DataUtils.getDataKey(json);

    JSONObject data = json.getJSONObject(dataKey);
    MarketDetail marketDetail = new MarketDetailParser().parse(data);
    return MarketDetailReq.builder()
        .ch(json.getString("rep"))
        .ts(json.getLong("ts"))
        .detail(marketDetail)
        .build();
  }

  @Override
  public MarketDetailReq parse(JSONArray json) {
    return null;
  }

  @Override
  public List<MarketDetailReq> parseArray(JSONArray jsonArray) {
    return null;
  }
}
