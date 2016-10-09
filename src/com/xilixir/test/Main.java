package com.xilixir.test;

import com.xilixir.test.T.Car;
import com.xilixir.test.T.Tardis;

// Written by Xilixir on 2016-10-09
public class Main {
    public static void main(String[] args){
        Transportation t1 = new Car("test1", TransportationType.WHEELS);
        Transportation t2 = new Tardis("test2", TransportationType.TELEPORTATION);

        t1.a();
        t2.a();
    }

    /*
    OUTPUT:

    a overridden
    a

     */
}
