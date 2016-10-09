package com.xilixir.test.T;

import com.xilixir.test.Transportation;
import com.xilixir.test.TransportationType;

// Written by Xilixir on 2016-10-09
public class Car extends Transportation {
    public Car(String name, TransportationType type) {
        super(name, type);
    }

    @Override
    public void a() {
        System.out.println("a overridden");
    }

    @Override
    public String test() {
        return null;
    }
}
