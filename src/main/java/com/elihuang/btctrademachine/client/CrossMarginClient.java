package com.elihuang.btctrademachine.client;

import com.elihuang.btctrademachine.client.req.crossmargin.*;
import com.elihuang.btctrademachine.constant.Options;
import com.elihuang.btctrademachine.constant.enums.ExchangeEnum;
import com.elihuang.btctrademachine.exception.SDKException;
import com.elihuang.btctrademachine.huobi.HuobiCrossMarginService;
import com.elihuang.btctrademachine.model.crossmargin.*;

import java.util.List;

public interface CrossMarginClient {

  Long transfer(CrossMarginTransferRequest request);

  Long applyLoan(CrossMarginApplyLoanRequest request);

  void repayLoan(CrossMarginRepayLoanRequest request);

  List<CrossMarginLoadOrder> getLoanOrders(CrossMarginLoanOrdersRequest request);

  CrossMarginAccount getLoanBalance();

  List<CrossMarginCurrencyInfo> getLoanInfo();

  static CrossMarginClient create(Options options) {

    if (options.getExchange().equals(ExchangeEnum.HUOBI)) {
      return new HuobiCrossMarginService(options);
    }
    throw new SDKException(SDKException.INPUT_ERROR, "Unsupport Exchange.");
  }

  List<GeneralRepayLoanResult> repayLoan(GeneralRepayLoanRequest request);

  List<GeneralRepayLoanRecord> getRepaymentLoanRecords(GeneralLoanOrdersRequest request);

}
