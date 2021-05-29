package com.kodilla.converter.domain;

public class MyKeyValue {

    private final String key;
    private final String value;

    public MyKeyValue(String field1, String field2) {
        key = field1;
        value = field2;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
