package com.elihuang.btctrademachine.client.req.algo;

import com.elihuang.btctrademachine.constant.enums.algo.AlgoOrderSideEnum;
import com.elihuang.btctrademachine.constant.enums.algo.AlgoOrderTimeInForceEnum;
import com.elihuang.btctrademachine.constant.enums.algo.AlgoOrderTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateAlgoOrderRequest {

  private String clientOrderId;

  private Long accountId;

  private String symbol;

  private AlgoOrderSideEnum orderSide;

  private AlgoOrderTypeEnum orderType;

  private AlgoOrderTimeInForceEnum timeInForce;

  private BigDecimal orderPrice;

  private BigDecimal orderSize;

  private BigDecimal orderValue;

  private BigDecimal stopPrice;

  private BigDecimal trailingRate;

}
