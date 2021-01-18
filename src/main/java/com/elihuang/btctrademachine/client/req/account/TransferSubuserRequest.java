package com.elihuang.btctrademachine.client.req.account;


import com.elihuang.btctrademachine.constant.enums.TransferMasterTypeEnum;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransferSubuserRequest {

  private Long subUid;

  private String currency;

  private BigDecimal amount;

  private TransferMasterTypeEnum type;

}
