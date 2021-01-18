package com.elihuang.btctrademachine.client.req.subuser;

import com.elihuang.btctrademachine.constant.enums.TransferabilityAccountTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubUserTransferabilityRequest {

  private String subUids;

  private TransferabilityAccountTypeEnum accountType;

  private String transferrable;

}
