package com.elihuang.btctrademachine.client.req.market;

import com.elihuang.btctrademachine.constant.enums.DepthSizeEnum;
import com.elihuang.btctrademachine.constant.enums.DepthStepEnum;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarketDepthRequest {

  private String symbol;

  private DepthSizeEnum depth;

  private DepthStepEnum step;

}
