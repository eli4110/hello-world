package com.elihuang.btctrademachine.model.crossmargin;

import com.elihuang.btctrademachine.model.account.Balance;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CrossMarginAccount {

  private Long id;

  private String type;

  private String state;

  private BigDecimal riskRate;

  private BigDecimal acctBalanceSum;

  private BigDecimal debtBalanceSum;

  private List<Balance> balanceList;

}
