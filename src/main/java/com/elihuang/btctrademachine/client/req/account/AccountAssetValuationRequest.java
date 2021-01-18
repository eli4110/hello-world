package com.elihuang.btctrademachine.client.req.account;

import com.elihuang.btctrademachine.constant.enums.AccountTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountAssetValuationRequest {

  AccountTypeEnum accountType;

  String valuationCurrency;

  Long subUid;

}
