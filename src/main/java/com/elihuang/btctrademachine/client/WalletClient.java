package com.elihuang.btctrademachine.client;


import com.elihuang.btctrademachine.client.req.wallet.*;
import com.elihuang.btctrademachine.constant.Options;
import com.elihuang.btctrademachine.constant.enums.ExchangeEnum;
import com.elihuang.btctrademachine.exception.SDKException;
import com.elihuang.btctrademachine.huobi.HuobiWalletService;
import com.elihuang.btctrademachine.model.wallet.DepositAddress;
import com.elihuang.btctrademachine.model.wallet.DepositWithdraw;
import com.elihuang.btctrademachine.model.wallet.WithdrawAddressResult;
import com.elihuang.btctrademachine.model.wallet.WithdrawQuota;

import java.util.List;

public interface WalletClient {

  List<DepositAddress> getDepositAddress(DepositAddressRequest request);

  WithdrawQuota getWithdrawQuota(WithdrawQuotaRequest request);

  WithdrawAddressResult getWithdrawAddress(WithdrawAddressRequest request);

  Long createWithdraw(CreateWithdrawRequest request);

  Long cancelWithdraw(Long withdrawId);

  List<DepositWithdraw> getDepositWithdraw(DepositWithdrawRequest request);

  static WalletClient create(Options options) {

    if (options.getExchange().equals(ExchangeEnum.HUOBI)) {
      return new HuobiWalletService(options);
    }
    throw new SDKException(SDKException.INPUT_ERROR, "Unsupport Exchange.");
  }
}
