package com.elihuang.btctrademachine.huobi.parser.algo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.algo.AlgoOrder;

import java.util.List;


public class AlgoOrderParser implements HuobiModelParser<AlgoOrder> {

  @Override
  public AlgoOrder parse(JSONObject json) {
    return json.toJavaObject(AlgoOrder.class);
  }

  @Override
  public AlgoOrder parse(JSONArray json) {
    return null;
  }

  @Override
  public List<AlgoOrder> parseArray(JSONArray jsonArray) {
    return jsonArray.toJavaList(AlgoOrder.class);
  }
}
