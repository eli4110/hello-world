package com.elihuang.btctrademachine.model.market;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarketTrade {

  private String id;

  private Long tradeId;

  private BigDecimal price;

  private BigDecimal amount;

  private String direction;

  private Long ts;

}
