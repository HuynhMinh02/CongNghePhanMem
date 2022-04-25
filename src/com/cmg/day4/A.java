package com.cmg.day4;

public class A {
    private B reObject;

    public A(B b) {
        this.reObject = b;
    }

    public A() {
        this.reObject = new B();
    }

    public void setReObject(B reObject) {
        this.reObject = reObject;
    }
    
}
