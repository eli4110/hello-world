package com.elihuang.btctrademachine.huobi.parser.account;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.crossmargin.GeneralRepayLoanResult;

import java.util.List;


public class GeneralRepayLoanResultParser implements HuobiModelParser<GeneralRepayLoanResult> {
    @Override
    public GeneralRepayLoanResult parse(JSONObject json) {
        return json.toJavaObject(GeneralRepayLoanResult.class);
    }

    @Override
    public GeneralRepayLoanResult parse(JSONArray json) {
        return null;
    }

    @Override
    public List<GeneralRepayLoanResult> parseArray(JSONArray jsonArray) {
        return jsonArray.toJavaList(GeneralRepayLoanResult.class);
    }
}
