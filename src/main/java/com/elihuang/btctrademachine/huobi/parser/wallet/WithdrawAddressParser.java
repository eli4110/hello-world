package com.elihuang.btctrademachine.huobi.parser.wallet;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.wallet.WithdrawAddress;

import java.util.List;

public class WithdrawAddressParser implements HuobiModelParser<WithdrawAddress> {

  @Override
  public WithdrawAddress parse(JSONObject json) {
    return null;
  }

  @Override
  public WithdrawAddress parse(JSONArray json) {
    return null;
  }

  @Override
  public List<WithdrawAddress> parseArray(JSONArray jsonArray) {
    return jsonArray.toJavaList(WithdrawAddress.class);
  }
}
