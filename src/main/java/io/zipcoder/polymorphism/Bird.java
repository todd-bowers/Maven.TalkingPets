package io.zipcoder.polymorphism;

public class Bird extends Pet{

    public Bird() {
        super("Jeff");
    }
    public Bird(String name) {
        super(name);
    }
    public String speak() {
        return "chirp";
    }
}
