package com.elihuang.btctrademachine.huobi.parser.subuser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.subuser.SubUserApiKeyModificationResult;

import java.util.List;

public class SubUserApiKeyModificationResultParser implements HuobiModelParser<SubUserApiKeyModificationResult> {

  @Override
  public SubUserApiKeyModificationResult parse(JSONObject json) {
    return json.toJavaObject(SubUserApiKeyModificationResult.class);
  }

  @Override
  public SubUserApiKeyModificationResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<SubUserApiKeyModificationResult> parseArray(JSONArray jsonArray) {
    return null;
  }
}
