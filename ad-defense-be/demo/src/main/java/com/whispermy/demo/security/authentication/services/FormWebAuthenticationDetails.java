package com.whispermy.demo.security.authentication.services;

import org.springframework.security.web.authentication.WebAuthenticationDetails;

import jakarta.servlet.http.HttpServletRequest;

public class FormWebAuthenticationDetails extends WebAuthenticationDetails {

    private static final long serialVersionUID = 1L;

    private final String verificationCode;

    public FormWebAuthenticationDetails(HttpServletRequest request) {
        super(request);
        verificationCode = request.getParameter("code");
    }

    public String getVerificationCode() {

        return verificationCode;
    }
}