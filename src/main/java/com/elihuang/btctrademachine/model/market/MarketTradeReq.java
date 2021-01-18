package com.elihuang.btctrademachine.model.market;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarketTradeReq {

  private String ch;

  private List<MarketTrade> list;
}
