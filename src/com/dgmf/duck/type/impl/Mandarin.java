package com.dgmf.duck.type.impl;

import com.dgmf.duck.type.Duck;

public class Mandarin extends Duck {
    @Override
    public void display() {
        displayMandarin();
    }

    private void displayMandarin() {
        System.out.println("I am a Mandarin, a Duck Subtype ...");
    }
}
