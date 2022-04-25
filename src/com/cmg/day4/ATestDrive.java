package com.cmg.day4;

public class ATestDrive {
    public static void main(String[] args) {
        B b = new B();

        // cach 1
        A a = new A(b);

        //cach 2
        A a2 = new A();
        a2.setReObject(b);

        
    }
}
