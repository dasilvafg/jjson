package br.com.siprov.jjson.junit.data;

import br.com.siprov.jjson.JSONPropertyIgnore;
import br.com.siprov.jjson.JSONPropertyName;

public interface MyBeanCustomNameInterface {
    @JSONPropertyName("InterfaceField")
    float getSomeFloat();
    @JSONPropertyIgnore
    int getIgnoredInt();
}