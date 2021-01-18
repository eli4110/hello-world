package com.elihuang.btctrademachine.model.market;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CandlestickEvent {

  private String ch;

  private Long ts;

  private Candlestick candlestick;

}
