package com.demo.junitbatch66exm;

import com.demo.inject.APIService;
import com.demo.inject.EmailService;
import com.demo.inject.SMSService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class APIServiceTest {
    @Mock
    EmailService emailService;
    @Mock
    SMSService smsService;
    @InjectMocks
    APIService apiService;
    @Test
    public void testAPI(){
    when(apiService.sendEmail("Email")).thenReturn(true);
    when(apiService.sendSMS(anyString())).thenReturn(true);

    assertTrue(apiService.sendEmail("Email"));
    assertFalse(apiService.sendSMS("Welcome"));
//    assertTrue(apiService.sendEmail("Hello"));
    }
}
