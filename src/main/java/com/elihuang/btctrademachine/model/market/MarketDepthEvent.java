package com.elihuang.btctrademachine.model.market;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarketDepthEvent {

  private String ch;

  private Long ts;

  private MarketDepth depth;
}
