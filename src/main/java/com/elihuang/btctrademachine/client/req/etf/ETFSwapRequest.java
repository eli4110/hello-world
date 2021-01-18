package com.elihuang.btctrademachine.client.req.etf;

import com.elihuang.btctrademachine.constant.enums.EtfSwapDirectionEnum;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ETFSwapRequest {

  private EtfSwapDirectionEnum direction;

  private String etfName;

  private BigDecimal amount;

}
