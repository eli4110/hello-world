package com.elihuang.btctrademachine.client.req.wallet;

import com.elihuang.btctrademachine.constant.enums.DepositWithdrawTypeEnum;
import com.elihuang.btctrademachine.constant.enums.QueryDirectionEnum;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepositWithdrawRequest {

  private DepositWithdrawTypeEnum type;

  private String currency;

  private Long from;

  private Integer size;

  private QueryDirectionEnum direction;

}
