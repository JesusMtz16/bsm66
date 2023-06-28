package com.demo.junitbatch66exm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class StaticTest {
    StaticUtils staticUtils;
    @BeforeEach
    public void init(){
        staticUtils = new StaticUtils();
    }


@Test
    public void StaticTest(){
        try(MockedStatic mockedStatic = Mockito.mockStatic(StaticUtils.class)){
            mockedStatic.when(StaticUtils::range).thenReturn("Welcome");
            assertEquals(StaticUtils.range(),"Welcome");
        }
    }


}
