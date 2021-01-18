package com.elihuang.btctrademachine.huobi.parser.subuser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.subuser.SubUserManagementResult;

import java.util.List;

public class SubUserManagementResultParser implements HuobiModelParser<SubUserManagementResult> {

  @Override
  public SubUserManagementResult parse(JSONObject json) {
    return json.toJavaObject(SubUserManagementResult.class);
  }

  @Override
  public SubUserManagementResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<SubUserManagementResult> parseArray(JSONArray jsonArray) {
    return null;
  }
}
