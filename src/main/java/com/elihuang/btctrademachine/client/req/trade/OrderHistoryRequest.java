package com.elihuang.btctrademachine.client.req.trade;

import com.elihuang.btctrademachine.constant.enums.QueryDirectionEnum;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderHistoryRequest {

  private String symbol;

  private Long startTime;

  private Long endTime;

  private QueryDirectionEnum direction;

  private Integer size;

}
