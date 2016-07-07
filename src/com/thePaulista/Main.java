package com.thePaulista;

public class Main {

    public static void main(String[] args) {
	    // width of int = 32 (4 bytes)
        int myIntValue = 5;

        // float has 6 digits of precision
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f;

        // double has 16 digits of precision
        // width of double = 64 (8 bytes)
        // it is faster on modern computer
        // more precise
        // recommended over floats
        // and it does take double amount of space
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue=" + myIntValue);
        System.out.println("myFloatValue=" + myFloatValue);
        System.out.println("myDoubleValue=" + myDoubleValue);

        // convert a given number of pounds to kg;
        // 1. create a variable to store the number of pounds;
        // 2. calculate the number of kg for the number above and store in a variable;
        // 3. print out the result;

        double kilo = 0.45359237d;
        double pound = 5;
        System.out.println("Five lbs to a kilo is " + (kilo * pound) + " kilograms.");

    }
}
