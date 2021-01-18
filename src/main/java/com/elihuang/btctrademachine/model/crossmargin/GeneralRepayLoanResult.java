package com.elihuang.btctrademachine.model.crossmargin;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GeneralRepayLoanResult {

    private String repayId;

    private long repayTime;
}
