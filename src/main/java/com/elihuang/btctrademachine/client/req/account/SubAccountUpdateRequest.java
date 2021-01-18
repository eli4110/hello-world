package com.elihuang.btctrademachine.client.req.account;

import com.elihuang.btctrademachine.constant.enums.AccountUpdateModeEnum;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SubAccountUpdateRequest {

  private AccountUpdateModeEnum accountUpdateMode;

}
