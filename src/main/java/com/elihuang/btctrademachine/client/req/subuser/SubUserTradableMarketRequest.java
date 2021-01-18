package com.elihuang.btctrademachine.client.req.subuser;

import com.elihuang.btctrademachine.constant.enums.TradableMarketAccountTypeEnum;
import com.elihuang.btctrademachine.constant.enums.TradableMarketActivationEnums;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubUserTradableMarketRequest {

  private String subUids;

  private TradableMarketAccountTypeEnum accountType;

  private TradableMarketActivationEnums activation;

}
