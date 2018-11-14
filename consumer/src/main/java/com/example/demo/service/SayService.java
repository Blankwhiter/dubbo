package com.example.demo.service;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;

/**
 * Created by WU on 2018/8/23.
 */
@Component
public class SayService {
    @Reference
    SayHello sayHello;

    public String say (String name) {

        return sayHello.sayHello(name);
    }
}
