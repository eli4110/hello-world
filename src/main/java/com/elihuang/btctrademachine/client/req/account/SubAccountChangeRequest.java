package com.elihuang.btctrademachine.client.req.account;

import com.elihuang.btctrademachine.constant.enums.BalanceModeEnum;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SubAccountChangeRequest {

  private BalanceModeEnum balanceMode;

}
