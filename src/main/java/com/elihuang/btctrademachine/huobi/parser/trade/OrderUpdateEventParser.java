package com.elihuang.btctrademachine.huobi.parser.trade;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.trade.OrderUpdateEvent;

import java.util.List;


@Deprecated
public class OrderUpdateEventParser implements HuobiModelParser<OrderUpdateEvent> {

    @Override
    public OrderUpdateEvent parse(JSONObject json) {
        return OrderUpdateEvent.builder()
                .topic(json.getString("topic"))
                .ts(json.getLong("ts"))
                .update(new OrderUpdateParser().parse(json.getJSONObject("data")))
                .build();
    }

    @Override
    public OrderUpdateEvent parse(JSONArray json) {
        return null;
    }

    @Override
    public List<OrderUpdateEvent> parseArray(JSONArray jsonArray) {
        return null;
    }
}
