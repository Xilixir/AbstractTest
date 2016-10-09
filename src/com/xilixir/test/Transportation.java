package com.xilixir.test;

// Written by Xilixir on 2016-10-09
public abstract class Transportation {
    private String name;
    private TransportationType type;

    public Transportation(String name, TransportationType type) {
        this.name = name;
        this.type = type;
    }

    public abstract String test();

    public void a(){
        System.out.println("a");
    }

    public String getName() {
        return name;
    }

    public TransportationType getType() {
        return type;
    }
}
