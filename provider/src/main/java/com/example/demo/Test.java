package com.example.demo;

/**
 * Created by WU on 2018/8/27.
 */
public class Test {
    public static final int max = Integer.MAX_VALUE;
    public  static  final  int begin = max -100;
    public static void main(String[] args) {
        int j=0;
        for (int i = begin; i < max; i++) {
            j++;
        }
        System.out.println(j);
    }
}
