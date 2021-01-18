package com.elihuang.btctrademachine.huobi.parser.account;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.account.PointTransferResult;

import java.util.List;

public class PointTransferResultParser implements HuobiModelParser<PointTransferResult> {

  @Override
  public PointTransferResult parse(JSONObject json) {
    return json.toJavaObject(PointTransferResult.class);
  }

  @Override
  public PointTransferResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<PointTransferResult> parseArray(JSONArray jsonArray) {
    return null;
  }

}
