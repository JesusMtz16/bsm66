package com.demo.junitbatch66exm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVoid {
    private TestVoidMethod testVoidMethod;
    @BeforeEach
    public  void  init(){
        testVoidMethod =new TestVoidMethod();
        testVoidMethod.addString("apple","Fruits");
        testVoidMethod.addString("Mobile","Electronics");
    }
    @Test
    public void testAddString(){
        assertEquals(2,testVoidMethod.lenght());

    }
}
