package com.elihuang.btctrademachine.huobi.parser.subuser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.subuser.GetSubUserDepositResult;

import java.util.List;

public class GetSubUserDepositResultParser implements HuobiModelParser<GetSubUserDepositResult> {

  @Override
  public GetSubUserDepositResult parse(JSONObject json) {
    return GetSubUserDepositResult.builder()
        .nextId(json.getLong("nextId"))
        .list(new SubUserDepositParser().parseArray(json.getJSONArray("data")))
        .build();
  }

  @Override
  public GetSubUserDepositResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<GetSubUserDepositResult> parseArray(JSONArray jsonArray) {
    return null;
  }
}
