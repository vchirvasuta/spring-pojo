package com.vali.springpojo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class MyTestClass {

    @Test
    public void test() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(1,map.get(1)+1);
        map.put(1,map.get(1)+1);
        map.put(1,map.get(1)+1);


        System.out.println(map.get(1));


    }
}
