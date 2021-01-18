package com.elihuang.btctrademachine.huobi.parser.generic;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.generic.CurrencyChain;

import java.util.List;


public class CurrencyChainParser implements HuobiModelParser<CurrencyChain> {

  @Override
  public CurrencyChain parse(JSONObject json) {
    return json.toJavaObject(CurrencyChain.class);
  }

  @Override
  public CurrencyChain parse(JSONArray json) {
    return null;
  }

  @Override
  public List<CurrencyChain> parseArray(JSONArray jsonArray) {
    return jsonArray.toJavaList(CurrencyChain.class);
  }
}
