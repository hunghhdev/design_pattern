package org.example.signleton;

public class Connection {

    private static Connection instance;

    public synchronized static Connection getInstance(){
        if (instance==null) instance = new Connection();
        return instance;
    }

    private Connection(){}

}
