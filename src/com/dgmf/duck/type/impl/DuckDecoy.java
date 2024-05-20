package com.dgmf.duck.type.impl;

import com.dgmf.duck.type.Duck;

public class DuckDecoy extends Duck {
    @Override
    public void display() {
        // Appearance of a DuckDecoy
        displayDuckDecoy();
    }

    private void displayDuckDecoy() {
        System.out.println("I am a Duck Decoy, a Duck Subtype ...");
    }

    @Override
    public void quack() {
        muteDuck();
    }

    private void muteDuck() {
        System.out.println("I am a Duck Decoy, and I am a Mute Duck ...");
    }

    @Override
    public void fly() {
        doNotFly();
    }

    private void doNotFly() {
        // Redefine To Do Nothing
        System.out.println("I'm a Duck Decoy, and I don't fly ...");
    }
}
