package com.elihuang.btctrademachine.model.market;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarketBBOEvent {

  private String ch;

  private Long ts;

  private MarketBBO bbo;
}
