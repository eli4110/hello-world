package com.elihuang.btctrademachine.huobi.parser.subuser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.subuser.SubUserTradableMarketState;

import java.util.List;

public class SubUserTradableMarketStateParser implements HuobiModelParser<SubUserTradableMarketState> {

  @Override
  public SubUserTradableMarketState parse(JSONObject json) {
    return null;
  }

  @Override
  public SubUserTradableMarketState parse(JSONArray json) {
    return null;
  }

  @Override
  public List<SubUserTradableMarketState> parseArray(JSONArray jsonArray) {
    return jsonArray.toJavaList(SubUserTradableMarketState.class);
  }
}
