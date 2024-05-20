package com.dgmf.duck.types.impl;

import com.dgmf.duck.types.Duck;

public class Mandarin extends Duck {
    @Override
    public void display() {
        displayMandarin();
    }

    private void displayMandarin() {
        System.out.println("I am a Mandarin, a Duck Subtype ...");
    }
}
