package com.assignment;

import java.util.HashMap;

public class HashMapD {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(2,"riya");
        map.put(4,"janu");
        map.put(7,"tanu");
        System.out.println("HashMap :" + map);

        System.out.println("Key is present or not :" + map.containsKey(2));
        //  System.out.println(map.contains(2)) ;

    }


}
