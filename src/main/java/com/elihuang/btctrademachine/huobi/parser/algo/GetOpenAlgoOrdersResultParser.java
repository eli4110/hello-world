package com.elihuang.btctrademachine.huobi.parser.algo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.algo.GetOpenAlgoOrdersResult;

import java.util.List;


public class GetOpenAlgoOrdersResultParser implements HuobiModelParser<GetOpenAlgoOrdersResult> {

  @Override
  public GetOpenAlgoOrdersResult parse(JSONObject json) {
    return GetOpenAlgoOrdersResult.builder()
        .list(new AlgoOrderParser().parseArray(json.getJSONArray("data")))
        .nextId(json.getLong("nextId"))
        .build();
  }

  @Override
  public GetOpenAlgoOrdersResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<GetOpenAlgoOrdersResult> parseArray(JSONArray jsonArray) {
    return null;
  }
}
