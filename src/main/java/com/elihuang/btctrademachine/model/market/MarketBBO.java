package com.elihuang.btctrademachine.model.market;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarketBBO {

  private String symbol;

  private Long quoteTime;

  private BigDecimal bid;

  private BigDecimal bidSize;

  private BigDecimal ask;

  private BigDecimal askSize;

}
