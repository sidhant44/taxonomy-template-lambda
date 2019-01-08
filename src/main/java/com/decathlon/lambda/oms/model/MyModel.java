package com.ge.lambda.taxonomy.model;

public class MyModel {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyModel{" +
                "message='" + message + '\'' +
                '}';
    }
}
