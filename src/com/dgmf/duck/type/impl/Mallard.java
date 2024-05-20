package com.dgmf.duck.type.impl;

import com.dgmf.duck.type.Duck;

public class Mallard extends Duck {
    @Override
    public void display() {
        displayMallard();
    }

    private void displayMallard() {
        System.out.println("I am a Mallard, a Duck Subtype ...");
    }
}
