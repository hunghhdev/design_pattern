package org.example.facade;

public class FacebookShare implements IShare{

    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to facebook: " + message);
    }
}
