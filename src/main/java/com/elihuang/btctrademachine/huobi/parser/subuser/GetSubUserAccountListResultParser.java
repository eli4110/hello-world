package com.elihuang.btctrademachine.huobi.parser.subuser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.subuser.GetSubUserAccountListResult;

import java.util.List;

public class GetSubUserAccountListResultParser implements HuobiModelParser<GetSubUserAccountListResult> {

  @Override
  public GetSubUserAccountListResult parse(JSONObject json) {
    return json.toJavaObject(GetSubUserAccountListResult.class);
  }

  @Override
  public GetSubUserAccountListResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<GetSubUserAccountListResult> parseArray(JSONArray jsonArray) {
    return null;
  }
}
