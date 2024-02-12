package br.com.siprov.jjson.junit.data;

import br.com.siprov.jjson.*;

/**
 * Used in testing when a JSONString is needed
 */
public class MyJsonString implements JSONString {

    @Override
    public String toJSONString() {
        return "my string";
    }
}