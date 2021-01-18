package com.elihuang.btctrademachine.model.trade;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderListReq {

  private String topic;

  private Long ts;

  private List<Order> orderList;

}
