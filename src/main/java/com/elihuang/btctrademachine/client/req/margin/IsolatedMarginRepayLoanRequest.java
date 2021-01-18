package com.elihuang.btctrademachine.client.req.margin;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IsolatedMarginRepayLoanRequest {

  private Long orderId;

  private BigDecimal amount;

}
