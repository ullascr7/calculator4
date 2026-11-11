
package com.example.vvce.calculator4;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        App obj = new App();

        System.out.println("Addition: " + obj.add(10, 5));

        System.out.println("Subtraction: " + obj.subtract(10, 5));
    }
}
