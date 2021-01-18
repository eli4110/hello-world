package com.elihuang.btctrademachine.huobi.parser.algo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.algo.CancelAlgoOrderResult;

import java.util.List;


public class CancelAlgoOrderResultParser implements HuobiModelParser<CancelAlgoOrderResult> {

  @Override
  public CancelAlgoOrderResult parse(JSONObject json) {
    return json.toJavaObject(CancelAlgoOrderResult.class);
  }

  @Override
  public CancelAlgoOrderResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<CancelAlgoOrderResult> parseArray(JSONArray jsonArray) {
    return null;
  }
}
