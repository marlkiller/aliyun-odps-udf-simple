package com.alibaba.dataworks.udf;

import com.aliyun.odps.udf.UDF;

public final class Lower extends UDF {

    public String evaluate(String s) {
        if (s == null) {
            return null;
        }
        return s.toLowerCase();
    }
}