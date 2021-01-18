package com.elihuang.btctrademachine.model.etf;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ETFUnitPrice {

  private String currency;
  private BigDecimal amount;

}
