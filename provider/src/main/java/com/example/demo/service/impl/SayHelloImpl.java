package com.example.demo.service.impl;

import com.example.demo.service.SayHello;

/**
 * Created by WU on 2018/8/23.
 */
public class SayHelloImpl  implements SayHello {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
}
}
