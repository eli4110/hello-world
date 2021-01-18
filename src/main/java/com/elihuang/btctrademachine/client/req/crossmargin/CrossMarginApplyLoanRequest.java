package com.elihuang.btctrademachine.client.req.crossmargin;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CrossMarginApplyLoanRequest {

  private String currency;

  private BigDecimal amount;

}
