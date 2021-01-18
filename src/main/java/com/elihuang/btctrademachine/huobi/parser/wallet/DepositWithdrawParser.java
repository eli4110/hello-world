package com.elihuang.btctrademachine.huobi.parser.wallet;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.wallet.DepositWithdraw;

import java.util.ArrayList;
import java.util.List;

public class DepositWithdrawParser implements HuobiModelParser<DepositWithdraw> {

  @Override
  public DepositWithdraw parse(JSONObject json) {

    DepositWithdraw depositWithdraw = json.toJavaObject(DepositWithdraw.class);
    depositWithdraw.setTxHash(json.getString("tx-hash"));
    depositWithdraw.setAddressTag(json.getString("address-tag"));
    depositWithdraw.setCreatedAt(json.getLong("created-at"));
    depositWithdraw.setUpdatedAt(json.getLong("updated-at"));
    depositWithdraw.setErrorCode(json.getString("error-code"));
    depositWithdraw.setErrorMessage(json.getString("error-msg"));
    return depositWithdraw;
  }

  @Override
  public DepositWithdraw parse(JSONArray json) {
    return null;
  }

  @Override
  public List<DepositWithdraw> parseArray(JSONArray jsonArray) {
    if (jsonArray == null || jsonArray.size() <= 0) {
      return new ArrayList<>();
    }

    List<DepositWithdraw> list = new ArrayList<>();
    for (int i = 0; i < jsonArray.size(); i++) {
      list.add(parse(jsonArray.getJSONObject(i)));
    }
    return list;
  }
}
