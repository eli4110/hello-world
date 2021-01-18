package com.elihuang.btctrademachine.huobi.parser.account;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.crossmargin.GeneralRepayLoanRecord;

import java.util.List;


public class GeneralRepayLoanRecordParser implements HuobiModelParser<GeneralRepayLoanRecord> {
    @Override
    public GeneralRepayLoanRecord parse(JSONObject json) {
        return json.toJavaObject(GeneralRepayLoanRecord.class);
    }

    @Override
    public GeneralRepayLoanRecord parse(JSONArray json) {
        return null;
    }

    @Override
    public List<GeneralRepayLoanRecord> parseArray(JSONArray jsonArray) {
        return jsonArray.toJavaList(GeneralRepayLoanRecord.class);
    }
}
