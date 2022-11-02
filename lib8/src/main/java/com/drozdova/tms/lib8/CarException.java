package com.drozdova.tms.lib8;

public class CarException extends Exception{
    public CarException() {
        super();
    }

    public CarException(String message) {
        super(message);
    }

    public CarException(Exception e) {
        super(e);
    }

    public CarException(String message, Exception e) {
        super(message, e);
    }
}
