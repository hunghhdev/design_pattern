package org.example.facade;

public class TwitterShare implements IShare {

    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to twitter: " + message);
    }
}
