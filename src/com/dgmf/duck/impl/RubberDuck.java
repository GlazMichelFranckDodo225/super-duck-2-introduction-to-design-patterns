package com.dgmf.duck.impl;

import com.dgmf.duck.Duck;

// Each Duck Subtype is Responsible for Implementing the
// Behavior of the "display()" Method for How It Will
// Appear on the Screen
public class RubberDuck extends Duck {
    @Override
    public void display() {
        // Appearance of a Mandarin
        displayRubberDuck();
    }

    private void displayRubberDuck() {
        System.out.println("I am a Rubber Duck, a Duck Subtype. ");
    }
}

