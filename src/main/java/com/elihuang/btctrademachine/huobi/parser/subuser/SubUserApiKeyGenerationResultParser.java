package com.elihuang.btctrademachine.huobi.parser.subuser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.subuser.SubUserApiKeyGenerationResult;

import java.util.List;

public class SubUserApiKeyGenerationResultParser implements HuobiModelParser<SubUserApiKeyGenerationResult> {

  @Override
  public SubUserApiKeyGenerationResult parse(JSONObject json) {
    return json.toJavaObject(SubUserApiKeyGenerationResult.class);
  }

  @Override
  public SubUserApiKeyGenerationResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<SubUserApiKeyGenerationResult> parseArray(JSONArray jsonArray) {
    return null;
  }
}
