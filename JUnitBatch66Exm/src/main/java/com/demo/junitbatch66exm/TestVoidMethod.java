package com.demo.junitbatch66exm;

import java.util.HashMap;
import java.util.Map;

public class TestVoidMethod {
    private Map<String,String> map = new HashMap<String,String>();
    public void addString(String word, String meaning){
        System.out.println("Real Method");
        map.put(word,meaning);
    }
    public int lenght(){
       return map.size();
    }
}
