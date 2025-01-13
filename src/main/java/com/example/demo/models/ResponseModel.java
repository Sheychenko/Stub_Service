package com.example.demo.models;

public class ResponseModel {
    private String message;
    private String nameFromRequest;
    private long responseTime;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getnameFromRequest() {
        return nameFromRequest;
    }

    public void setnameFromRequest(String nameFromRequest) {
        this.nameFromRequest = nameFromRequest;
    }
    public long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }
}
