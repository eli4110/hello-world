package com.elihuang.btctrademachine.model.subuser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetSubUserListResult {

  private List<SubUserState> userList;

  private Long nextId;

}
