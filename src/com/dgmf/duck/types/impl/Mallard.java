package com.dgmf.duck.types.impl;

import com.dgmf.duck.types.Duck;

public class Mallard extends Duck {
    @Override
    public void display() {
        displayMallard();
    }

    private void displayMallard() {
        System.out.println("I am a Mallard, a Duck Subtype ...");
    }
}
