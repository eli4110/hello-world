package com.elihuang.btctrademachine.huobi.parser.wallet;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.wallet.WithdrawQuota;

import java.util.List;


public class WithdrawQuotaParser implements HuobiModelParser<WithdrawQuota> {

  @Override
  public WithdrawQuota parse(JSONObject json) {
    return json.toJavaObject(WithdrawQuota.class);
  }

  @Override
  public WithdrawQuota parse(JSONArray json) {
    return null;
  }

  @Override
  public List<WithdrawQuota> parseArray(JSONArray jsonArray) {
    return null;
  }
}
