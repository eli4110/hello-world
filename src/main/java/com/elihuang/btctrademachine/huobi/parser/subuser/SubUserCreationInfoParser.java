package com.elihuang.btctrademachine.huobi.parser.subuser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.subuser.SubUserCreationInfo;

import java.util.List;

public class SubUserCreationInfoParser implements HuobiModelParser<SubUserCreationInfo> {

  @Override
  public SubUserCreationInfo parse(JSONObject json) {
    return null;
  }

  @Override
  public SubUserCreationInfo parse(JSONArray json) {
    return null;
  }

  @Override
  public List<SubUserCreationInfo> parseArray(JSONArray jsonArray) {
    return jsonArray.toJavaList(SubUserCreationInfo.class);
  }
}
