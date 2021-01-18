package com.elihuang.btctrademachine.huobi.parser.account;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.account.AccountAssetValuationResult;

import java.util.List;


public class AccountAssetValuationResultParser implements HuobiModelParser<AccountAssetValuationResult> {

  @Override
  public AccountAssetValuationResult parse(JSONObject json) {
    return json.toJavaObject(AccountAssetValuationResult.class);
  }

  @Override
  public AccountAssetValuationResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<AccountAssetValuationResult> parseArray(JSONArray jsonArray) {
    return null;
  }

}
