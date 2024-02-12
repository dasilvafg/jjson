package io.github.dasilvafg.jjson.junit.data;

import io.github.dasilvafg.jjson.JSONPropertyIgnore;
import io.github.dasilvafg.jjson.JSONPropertyName;

public interface MyBeanCustomNameInterface {
    @JSONPropertyName("InterfaceField")
    float getSomeFloat();
    @JSONPropertyIgnore
    int getIgnoredInt();
}