package com.example.project;

public class Main {
    public static void main(String[] args) {
        HorseBarn barn1 = new HorseBarn(5);
        Horse[] horses1 = barn1.getStalls();
        Horse[] expected = new Horse[5];
        System.out.println(expected);
    }
}
