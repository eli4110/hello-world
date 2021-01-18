package com.elihuang.btctrademachine.client.req.trade;

import com.elihuang.btctrademachine.constant.enums.OrderStateEnum;
import com.elihuang.btctrademachine.constant.enums.OrderTypeEnum;
import com.elihuang.btctrademachine.constant.enums.QueryDirectionEnum;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrdersRequest {

  private String symbol;

  private List<OrderStateEnum> states;

  private List<OrderTypeEnum> types;

  private Date startDate;

  private Date endDate;

  private Long startId;

  private Integer size;

  private QueryDirectionEnum direct;



  public String getTypesString(){
    String typeString = null;
    if (this.getTypes() != null && this.getTypes().size() > 0) {
      StringBuffer typeBuffer = new StringBuffer();
      this.getTypes().forEach(orderType -> {
        typeBuffer.append(orderType.getCode()).append(",");
      });

      typeString = typeBuffer.substring(0, typeBuffer.length() - 1);
    }
    return typeString;
  }

  public String getStatesString(){
    String stateString = null;
    if (this.getStates() != null && this.getStates().size() > 0) {
      StringBuffer statesBuffer = new StringBuffer();
      this.getStates().forEach(orderType -> {
        statesBuffer.append(orderType.getCode()).append(",");
      });
      stateString = statesBuffer.substring(0, statesBuffer.length() - 1);
    }
    return stateString;
  }

}
