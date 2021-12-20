package com.pb.gurev.hw10;

public class NumBoxIsEmptyException extends RuntimeException {
    public NumBoxIsEmptyException() {
    }

    public NumBoxIsEmptyException(String message) {
        super(message);
    }
}