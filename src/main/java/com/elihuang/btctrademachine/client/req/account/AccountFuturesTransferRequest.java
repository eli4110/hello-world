package com.elihuang.btctrademachine.client.req.account;

import com.elihuang.btctrademachine.constant.enums.AccountFuturesTransferTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountFuturesTransferRequest {

  private String currency;

  private BigDecimal amount;

  private AccountFuturesTransferTypeEnum type;
}
