package com.elihuang.btctrademachine.utils;


import com.elihuang.btctrademachine.constant.enums.ConnectionStateEnum;

public interface WebSocketConnection {

  ConnectionStateEnum getState();

  Long getConnectionId();

  void reConnect();

  void reConnect(int delayInSecond);

  long getLastReceivedTime();

  void send(String str);
}
