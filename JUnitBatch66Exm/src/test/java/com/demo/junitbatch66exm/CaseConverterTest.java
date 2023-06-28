package com.demo.junitbatch66exm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaseConverterTest {

    CaseConverter c1;
    @BeforeEach
    void init(){
        c1 = new CaseConverter();
    }
    @Test
    public void testConvertCase(){
        assertEquals(c1.convertCase("hello"),"hello");
    }
    @Test
    public void testConvertCase2(){
        assertEquals(c1.convertCase("hello"),"HELLO");
    }
    @Test
    public void testConvertCase3(){
        assertEquals(c1.convertCase(""),"");
    }
    @Test
    public void testConvertCase4(){
        assertEquals(c1.convertCase(null),"");
    }
    @Test
    public void testConvertCase5(){
        assertEquals(c1.convertCase("7"),"7");
    }
}
