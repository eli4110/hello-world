package com.elihuang.btctrademachine.huobi.parser.trade;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.trade.OrderUpdateV2;

import java.util.List;


public class OrderUpdateV2Parser implements HuobiModelParser<OrderUpdateV2> {

  @Override
  public OrderUpdateV2 parse(JSONObject json) {
    return json.toJavaObject(OrderUpdateV2.class);
  }

  @Override
  public OrderUpdateV2 parse(JSONArray json) {
    return null;
  }

  @Override
  public List<OrderUpdateV2> parseArray(JSONArray jsonArray) {
    return null;
  }
}
