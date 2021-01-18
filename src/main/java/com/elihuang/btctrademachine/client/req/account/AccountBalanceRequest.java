package com.elihuang.btctrademachine.client.req.account;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccountBalanceRequest {

  private Long accountId;

}
