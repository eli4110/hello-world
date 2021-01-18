package com.elihuang.btctrademachine.client;


import com.elihuang.btctrademachine.client.req.margin.*;
import com.elihuang.btctrademachine.constant.Options;
import com.elihuang.btctrademachine.constant.enums.ExchangeEnum;
import com.elihuang.btctrademachine.exception.SDKException;
import com.elihuang.btctrademachine.huobi.HuobiIsolatedMarginService;
import com.elihuang.btctrademachine.model.isolatedmargin.IsolatedMarginAccount;
import com.elihuang.btctrademachine.model.isolatedmargin.IsolatedMarginLoadOrder;
import com.elihuang.btctrademachine.model.isolatedmargin.IsolatedMarginSymbolInfo;

import java.util.List;

public interface IsolatedMarginClient {

  Long transfer(IsolatedMarginTransferRequest request);

  Long applyLoan(IsolatedMarginApplyLoanRequest request);

  Long repayLoan(IsolatedMarginRepayLoanRequest request);

  List<IsolatedMarginLoadOrder> getLoanOrders(IsolatedMarginLoanOrdersRequest request);

  List<IsolatedMarginAccount> getLoanBalance(IsolatedMarginAccountRequest request);

  List<IsolatedMarginSymbolInfo> getLoanInfo(IsolatedMarginLoanInfoRequest request);

  static IsolatedMarginClient create(Options options) {

    if (options.getExchange().equals(ExchangeEnum.HUOBI)) {
      return new HuobiIsolatedMarginService(options);
    }
    throw new SDKException(SDKException.INPUT_ERROR, "Unsupport Exchange.");
  }
}
