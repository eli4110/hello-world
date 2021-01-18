package com.elihuang.btctrademachine.model.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BatchCancelOrderResult {

  private List<Long> successList;

  private List<CancelFailedResult> failedList;

}
