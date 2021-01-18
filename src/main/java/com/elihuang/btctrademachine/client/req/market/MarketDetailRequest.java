package com.elihuang.btctrademachine.client.req.market;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarketDetailRequest {

  private String symbol;

}
