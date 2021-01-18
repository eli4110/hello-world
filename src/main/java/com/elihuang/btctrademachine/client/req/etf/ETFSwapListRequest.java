package com.elihuang.btctrademachine.client.req.etf;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ETFSwapListRequest {

  private String etfName;

  private Integer offset;

  private Integer limit;

}
