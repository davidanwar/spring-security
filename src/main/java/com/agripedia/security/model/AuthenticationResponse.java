package com.agripedia.security.model;

public class AuthenticationResponse {

    private String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public AuthenticationResponse() {
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}