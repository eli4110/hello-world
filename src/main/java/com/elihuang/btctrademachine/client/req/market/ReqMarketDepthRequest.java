package com.elihuang.btctrademachine.client.req.market;

import com.elihuang.btctrademachine.constant.enums.DepthStepEnum;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReqMarketDepthRequest {

  private String symbol;

  private DepthStepEnum step;

}
