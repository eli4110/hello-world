package com.elihuang.btctrademachine.huobi.parser.subuser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.subuser.SubUserState;

import java.util.ArrayList;
import java.util.List;

public class SubUserStateParser implements HuobiModelParser<SubUserState> {

  @Override
  public SubUserState parse(JSONObject json) {
    return json.toJavaObject(SubUserState.class);
  }

  @Override
  public SubUserState parse(JSONArray json) {
    return null;
  }

  @Override
  public List<SubUserState> parseArray(JSONArray jsonArray) {
    if (jsonArray == null || jsonArray.isEmpty()) {
      return new ArrayList<>();
    }
    return jsonArray.toJavaList(SubUserState.class);
  }
}
