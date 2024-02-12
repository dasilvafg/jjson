package io.github.dasilvafg.jjson.junit.data;

import io.github.dasilvafg.jjson.*;

/**
 * Used in testing when a JSONString is needed
 */
public class MyJsonString implements JSONString {

    @Override
    public String toJSONString() {
        return "my string";
    }
}