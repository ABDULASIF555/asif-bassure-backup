package com.bassure.in.rr.app.model.event;

import java.util.Map;

public class EventResponse<T> {

    private String StatusCode;
    private String message;
    private T data;

    public EventResponse(String StatusCode, String message, T data) {
        this.StatusCode = StatusCode;
        this.message = message;
        this.data = data;
    }

    public String getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(String StatusCode) {
        this.StatusCode = StatusCode;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "EventResponse{" + "StatusCode=" + StatusCode + ", message=" + message + ", data=" + data + '}';
    }

    
    
    
    
}
