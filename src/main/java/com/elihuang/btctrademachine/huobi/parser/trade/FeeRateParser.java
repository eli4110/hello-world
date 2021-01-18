package com.elihuang.btctrademachine.huobi.parser.trade;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.trade.FeeRate;

import java.util.ArrayList;
import java.util.List;


public class FeeRateParser implements HuobiModelParser<FeeRate> {

  @Override
  public FeeRate parse(JSONObject json) {
    return json.toJavaObject(FeeRate.class);
  }

  @Override
  public FeeRate parse(JSONArray json) {
    return null;
  }

  @Override
  public List<FeeRate> parseArray(JSONArray jsonArray) {

    if (jsonArray == null || jsonArray.size() <= 0) {
      return new ArrayList<>();
    }

    return jsonArray.toJavaList(FeeRate.class);
  }
}
