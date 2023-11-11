
package com.ns.crud_postgresql.model;

import java.util.Map;


public class UserResponse<T> {
    
    private String statusCode;
    private Map<String,String>error;
    private String message;
    private T data;

    public UserResponse() {
    }

    public UserResponse(String statusCode, Map<String, String> error, String message, T data) {
        this.statusCode = statusCode;
        this.error = error;
        this.message = message;
        this.data = data;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, String> getError() {
        return error;
    }

    public void setError(Map<String, String> error) {
        this.error = error;
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
    
    
    
}
