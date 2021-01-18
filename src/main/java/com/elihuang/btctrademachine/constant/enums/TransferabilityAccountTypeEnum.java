package com.elihuang.btctrademachine.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TransferabilityAccountTypeEnum {

  SPOT("spot"),
  ;

  private final String accountType;

}
