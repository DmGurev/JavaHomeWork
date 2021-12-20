package com.pb.gurev.hw11;

public class FailedNumException extends Exception {
    private String message;
    public FailedNumException(String message) {
        this.message = message;
    }
}

