package com.elihuang.btctrademachine.huobi.parser.subuser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elihuang.btctrademachine.huobi.parser.HuobiModelParser;
import com.elihuang.btctrademachine.model.subuser.GetApiKeyListResult;

import java.util.List;

public class GetApiKeyListResultParser implements HuobiModelParser<GetApiKeyListResult> {


  @Override
  public GetApiKeyListResult parse(JSONObject json) {
    return GetApiKeyListResult.builder()
        .list(new ApiKeyInfoParser().parseArray(json.getJSONArray("data")))
        .build();
  }

  @Override
  public GetApiKeyListResult parse(JSONArray json) {
    return null;
  }

  @Override
  public List<GetApiKeyListResult> parseArray(JSONArray jsonArray) {
    return null;
  }
}
