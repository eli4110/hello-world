package com.elihuang.btctrademachine.huobi.parser.account;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.account.AccountUpdate;

import java.util.List;

public class AccountUpdateParser implements HuobiModelParser<AccountUpdate> {

  @Override
  public AccountUpdate parse(JSONObject json) {
    AccountUpdate update = json.toJavaObject(AccountUpdate.class);
    return update;
  }

  @Override
  public AccountUpdate parse(JSONArray json) {
    return null;
  }

  @Override
  public List<AccountUpdate> parseArray(JSONArray jsonArray) {
    return null;
  }
}
