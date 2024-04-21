package com.dgmf.duck.impl;

import com.dgmf.duck.Duck;

public class Mallard extends Duck {
    @Override
    public void display() {
        displayMallard();
    }

    private void displayMallard() {
        System.out.println("I am a Mallard, a Duck Subtype. ");
    }
}
