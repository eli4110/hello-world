package com.elihuang.btctrademachine.model.subuser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubUserTradableMarketResult {

  private List<SubUserTradableMarketState> list;

}
