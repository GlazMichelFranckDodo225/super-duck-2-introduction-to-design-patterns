package com.dgmf.duck;

// Duck Superclass that all other Duck Types inherit.
public abstract class Duck {
    // All the Ducks quack and swim. The Superclass manages
    // the Implementation Code.
    public void quack() {
        System.out.println("I'm a Duck and I'm quacking ...");
    }

    public void swim() {
        System.out.println("I'm a Duck and I'm swimming ...");
    }

    // Since all Duck-subtypes look different, the Display() Method
    // is Abstract. Each Duck-subtype is responsible for implementing
    // the Behavior of the display() Method for how it will appear on
    // the Screen.
    public abstract void display();

    // Added the fly() Method ==> All Subclasses inherit the fly() Method
    public void fly() {
        System.out.println("I'm a Duck and I'm flying ...");
    }
}
