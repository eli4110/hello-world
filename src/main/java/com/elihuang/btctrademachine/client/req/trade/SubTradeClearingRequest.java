package com.elihuang.btctrademachine.client.req.trade;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SubTradeClearingRequest {

  private String symbols;

}
