package com.elihuang.btctrademachine.client;


import com.elihuang.btctrademachine.client.req.etf.ETFSwapListRequest;
import com.elihuang.btctrademachine.client.req.etf.ETFSwapRequest;
import com.elihuang.btctrademachine.model.etf.ETFConfig;
import com.elihuang.btctrademachine.model.etf.ETFSwapRecord;

import java.util.List;

public interface ETFClient {

  ETFConfig getConfig(String etfName);

  void etfSwap(ETFSwapRequest request);

  List<ETFSwapRecord> getEtfSwapList(ETFSwapListRequest request);

}
