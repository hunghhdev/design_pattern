package org.example.proxy;

public class Main {

    public static void main(String[] args) {
        ICalculator calculator = new CalculatorProxy();

        double result =  calculator.add(1, 2);
        System.out.println(result);
    }
}
