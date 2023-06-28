package com.demo.junitbatch66exm;

import java.util.Arrays;
import java.util.List;

public class StaticUtils {

//    StaticUtils staticUtils = new StaticUtils();
    public static List<Integer> range (int start, int end){
        List list= Arrays.asList(1,2,3,4,5,6,7,8);
        return  list;
    }
    public  static  String range(){
        return "msg";
    }
    private String privateTest(String msg){
        return "Building";
    }
//    public String getTest(String msg){
//        return staticUtils.privateTest(msg);
//    }
}
