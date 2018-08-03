package com.tpa.client.tina.model;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangqianfeng on 16/9/21.
 */
@Keep
public abstract class TinaBaseRequest {

    @JSONField(serialize = false , deserialize = false)
    public Map<String,String> headers = new HashMap<String, String>();

    public void build() {}

}
