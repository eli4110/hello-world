package com.elihuang.btctrademachine.model.isolatedmargin;

import com.elihuang.btctrademachine.model.account.Balance;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IsolatedMarginAccount {

  private Long id;

  private String symbol;

  private BigDecimal flPrice;

  private String flType;

  private BigDecimal riskRate;

  private String type;

  private String state;

  private List<Balance> balanceList;

}
