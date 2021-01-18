package com.elihuang.btctrademachine.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TradableMarketAccountTypeEnum {

  ISOLATED_MARGIN("isolated-margin"),

  CROSS_MARGIN("cross-margin"),
  ;

  private final String accountType;

}
