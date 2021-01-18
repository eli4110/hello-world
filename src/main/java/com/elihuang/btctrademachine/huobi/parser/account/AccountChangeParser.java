package com.elihuang.btctrademachine.huobi.parser.account;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.account.AccountChange;

import java.util.ArrayList;
import java.util.List;


public class AccountChangeParser implements HuobiModelParser<AccountChange> {

  @Override
  public AccountChange parse(JSONObject json) {
    AccountChange change = json.toJavaObject(AccountChange.class);
    change.setType(json.getString("type"));
    return change;
  }

  @Override
  public AccountChange parse(JSONArray json) {
    return null;
  }

  @Override
  public List<AccountChange> parseArray(JSONArray jsonArray) {

    List<AccountChange> changeList = new ArrayList<>(jsonArray.size());
    for (int i = 0; i < jsonArray.size(); i++) {
      JSONObject jsonObject = jsonArray.getJSONObject(i);
      changeList.add(parse(jsonObject));
    }
    return changeList;
  }
}
