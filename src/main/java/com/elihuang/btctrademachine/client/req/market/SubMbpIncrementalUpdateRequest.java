package com.elihuang.btctrademachine.client.req.market;

import com.elihuang.btctrademachine.constant.enums.DepthLevels;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubMbpIncrementalUpdateRequest {

  private String symbol;

  private DepthLevels levels;

}
