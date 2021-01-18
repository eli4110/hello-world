package com.elihuang.btctrademachine.huobi.parser.subuser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.subuser.GetSubUserListResult;

import java.util.List;

public class GetSubUserListResultParser implements HuobiModelParser<GetSubUserListResult> {

  @Override
  public GetSubUserListResult parse(JSONObject json) {
    return GetSubUserListResult.builder()
        .userList(new SubUserStateParser().parseArray(json.getJSONArray("data")))
        .nextId(json.getLong("nextId"))
        .build();
  }

  @Override
  public GetSubUserListResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<GetSubUserListResult> parseArray(JSONArray jsonArray) {
    return null;
  }
}
