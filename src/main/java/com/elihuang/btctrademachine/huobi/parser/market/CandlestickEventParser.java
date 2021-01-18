package com.elihuang.btctrademachine.huobi.parser.market;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.huobi.utils.DataUtils;
import com.elihuang.btctrademachine.model.market.CandlestickEvent;

import java.util.List;

public class CandlestickEventParser implements HuobiModelParser<CandlestickEvent> {

  @Override
  public CandlestickEvent parse(JSONObject json) {

    String dataKey = DataUtils.getDataKey(json);

    return CandlestickEvent.builder()
        .ch(json.getString("ch"))
        .ts(json.getLong("ts"))
        .candlestick(new CandlestickParser().parse(json.getJSONObject(dataKey)))
        .build();
  }

  @Override
  public CandlestickEvent parse(JSONArray json) {
    return null;
  }

  @Override
  public List<CandlestickEvent> parseArray(JSONArray jsonArray) {
    return null;
  }
}
