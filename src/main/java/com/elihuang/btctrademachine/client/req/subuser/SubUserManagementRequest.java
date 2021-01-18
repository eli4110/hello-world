package com.elihuang.btctrademachine.client.req.subuser;

import com.elihuang.btctrademachine.constant.enums.SubUserManagementActionEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubUserManagementRequest {

  private Long subUid;

  private SubUserManagementActionEnum action;

}
