package com.gost.second;

public class Main {
    public static void main(String[] args) {
        long result = Factorial.computeFormula(5, 3);
        System.out.println("5! * 3! * (5 - 3)! = " + result);
    }
}
