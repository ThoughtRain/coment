package com.prarui.coment.utils;

import com.google.gson.Gson;

/**
 * 将对象转换成json字符串；
 */
public class GsonUtils {
    public static String toJson(Object o) {
        if (o == null)
            return null;
        Gson gson = new Gson();
        return gson.toJson(o);
    }

}
