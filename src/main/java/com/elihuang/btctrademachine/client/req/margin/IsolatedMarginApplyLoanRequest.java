package com.elihuang.btctrademachine.client.req.margin;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IsolatedMarginApplyLoanRequest {

  private String symbol;

  private String currency;

  private BigDecimal amount;

}
