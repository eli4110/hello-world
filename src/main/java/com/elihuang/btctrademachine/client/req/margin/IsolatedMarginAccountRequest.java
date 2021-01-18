package com.elihuang.btctrademachine.client.req.margin;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IsolatedMarginAccountRequest {

  private String symbol;

  private Long subUid;

}
