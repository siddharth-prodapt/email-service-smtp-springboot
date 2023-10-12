package com.example.demo;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServices {
	
    @Autowired
    private SmtpEmailSender smtpEmailSender;

    public void testEmail(String emailId) {

        MessageEmail email = new MessageEmail();

        email.setSubject("Registration Successful | SHIKSHAK SETU");

        email.setTo(Collections.singletonList(emailId));
        String message = "Dear ";

        email.setBody(message);
        email.setHtml(false);

        smtpEmailSender.sendMessage(email);
    }
}
