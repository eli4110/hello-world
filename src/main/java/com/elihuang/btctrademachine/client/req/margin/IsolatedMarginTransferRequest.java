package com.elihuang.btctrademachine.client.req.margin;

import com.elihuang.btctrademachine.constant.enums.MarginTransferDirectionEnum;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IsolatedMarginTransferRequest {

  private MarginTransferDirectionEnum direction;

  private String symbol;

  private String currency;

  private BigDecimal amount;

}
