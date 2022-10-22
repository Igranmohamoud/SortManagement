package com.sparta.im.exceptions;

public class ChildNotFoundException extends RuntimeException{
    public ChildNotFoundException(String s) {
    }

    @Override
    public String getMessage() {
        return "This node does not have child";
    }

}
