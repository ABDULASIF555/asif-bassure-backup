
package com.bassure.in.rr.app.model.event;


public class EventNotFound extends RuntimeException {
     private String message;

    public EventNotFound(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "EventNotFound{" + "message=" + message + '}';
    }
     
}
