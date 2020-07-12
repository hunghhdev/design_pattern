package org.example.signleton;

public class Main {

    public static void main(String[] args){
        Connection connection = Connection.getInstance();
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();
    }
}
