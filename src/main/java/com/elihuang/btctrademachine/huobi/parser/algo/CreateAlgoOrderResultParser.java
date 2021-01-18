package com.elihuang.btctrademachine.huobi.parser.algo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.algo.CreateAlgoOrderResult;

import java.util.List;


public class CreateAlgoOrderResultParser implements HuobiModelParser<CreateAlgoOrderResult> {

  @Override
  public CreateAlgoOrderResult parse(JSONObject json) {
    return CreateAlgoOrderResult.builder()
        .clientOrderId(json.getString("clientOrderId"))
        .build();
  }

  @Override
  public CreateAlgoOrderResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<CreateAlgoOrderResult> parseArray(JSONArray jsonArray) {
    return null;
  }
}
