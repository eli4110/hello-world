package com.elihuang.btctrademachine.model.market;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarketDepth {

  private long version;

  private Long ts;

  private List<PriceLevel> bids;

  private List<PriceLevel> asks;

}
