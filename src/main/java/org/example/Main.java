package org.example;

public class Main {
    public static void main(String[] args) {
        Progression prog1 = new ArithmeticProgression(4, 2);
        System.out.println(prog1.sum(4));
        Progression prog2 = new GeometricProgression(2, 2);
        System.out.println(prog2.getElement(4));
    }
}