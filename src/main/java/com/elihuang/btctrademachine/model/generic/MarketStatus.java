package com.elihuang.btctrademachine.model.generic;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarketStatus {

  private Integer marketStatus;

  private Long haltStartTime;

  private Long haltEndTime;

  private Integer haltReason;

  private String affectedSymbols;

}
