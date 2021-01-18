package com.elihuang.btctrademachine.huobi.parser.subuser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.subuser.SubUserTradableMarketResult;

import java.util.List;

public class SubUserTradableMarketResultParser implements HuobiModelParser<SubUserTradableMarketResult> {

  @Override
  public SubUserTradableMarketResult parse(JSONObject json) {
    return SubUserTradableMarketResult.builder()
        .list(new SubUserTradableMarketStateParser().parseArray(json.getJSONArray("data")))
        .build();
  }

  @Override
  public SubUserTradableMarketResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<SubUserTradableMarketResult> parseArray(JSONArray jsonArray) {
    return null;
  }
}
