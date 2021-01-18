package com.elihuang.btctrademachine.model.market;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PriceLevel {

  private BigDecimal price;

  private BigDecimal amount;

}
