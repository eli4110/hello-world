package com.elihuang.btctrademachine.client.req.generic;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CurrencyChainsRequest {

  private String currency;

  @Builder.Default
  private boolean authorizedUser = true;

}
