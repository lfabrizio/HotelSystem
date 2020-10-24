package com.fabrizio;

public class Main {

    public static void main(String[] args) {
        Hotel.welcome("Hotel RI");
      SuiteRoom tooSuite = new SuiteRoom(111, "double", 150, 100, 2, 2, true);
        System.out.println(tooSuite);
    }
}
