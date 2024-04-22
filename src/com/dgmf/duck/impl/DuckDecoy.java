package com.dgmf.duck.impl;

import com.dgmf.duck.Duck;

public class DuckDecoy extends Duck {
    @Override
    public void display() {
        // Appearance of a DuckDecoy
        displayDuckDecoy();
    }

    private void displayDuckDecoy() {
        System.out.println("I am a Duck Decoy, a Duck Subtype. ");
    }
}
