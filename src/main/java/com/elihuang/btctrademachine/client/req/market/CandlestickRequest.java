package com.elihuang.btctrademachine.client.req.market;

import com.elihuang.btctrademachine.constant.enums.CandlestickIntervalEnum;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CandlestickRequest {

  private String symbol;

  private CandlestickIntervalEnum interval;

  private Integer size;

}
