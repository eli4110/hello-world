package com.elihuang.btctrademachine.huobi.parser.subuser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.subuser.SubUserTransferabilityState;

import java.util.List;

public class SubUserTransferabilityStateParser implements HuobiModelParser<SubUserTransferabilityState> {

  @Override
  public SubUserTransferabilityState parse(JSONObject json) {
    return null;
  }

  @Override
  public SubUserTransferabilityState parse(JSONArray json) {
    return null;
  }

  @Override
  public List<SubUserTransferabilityState> parseArray(JSONArray jsonArray) {
    return jsonArray.toJavaList(SubUserTransferabilityState.class);
  }
}
