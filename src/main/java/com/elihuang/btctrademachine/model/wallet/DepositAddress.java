package com.elihuang.btctrademachine.model.wallet;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepositAddress {

  private String currency;

  private String address;

  private String addressTag;

  private String chain;

}
