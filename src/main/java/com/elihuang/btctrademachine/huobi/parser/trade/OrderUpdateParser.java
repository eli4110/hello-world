package com.elihuang.btctrademachine.huobi.parser.trade;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.trade.OrderUpdate;

import java.util.List;


public class OrderUpdateParser implements HuobiModelParser<OrderUpdate> {

  @Override
  public OrderUpdate parse(JSONObject json) {
    OrderUpdate update = json.toJavaObject(OrderUpdate.class);
    update.setUnfilledAmount(json.getBigDecimal("unfilled-amount"));
    update.setFilledAmount(json.getBigDecimal("filled-amount"));
    update.setFilledCashAmount(json.getBigDecimal("filled-cash-amount"));
    update.setOrderId(json.getLong("order-id"));
    update.setMatchId(json.getLong("match-id"));
    update.setRole(json.getString("role"));
    update.setOrderType(json.getString("order-type"));
    update.setOrderState(json.getString("order-state"));
    update.setClientOrderId(json.getString("client-order-id"));
    return update;
  }

  @Override
  public OrderUpdate parse(JSONArray json) {
    return null;
  }

  @Override
  public List<OrderUpdate> parseArray(JSONArray jsonArray) {
    return null;
  }
}
