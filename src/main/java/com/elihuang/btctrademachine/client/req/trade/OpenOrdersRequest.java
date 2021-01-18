package com.elihuang.btctrademachine.client.req.trade;

import com.elihuang.btctrademachine.constant.enums.OrderSideEnum;
import com.elihuang.btctrademachine.constant.enums.QueryDirectionEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OpenOrdersRequest {

  private  String symbol;

  private Long accountId;

  private Integer size;

  private OrderSideEnum side;

  private QueryDirectionEnum direct;

  private Long from;

}
