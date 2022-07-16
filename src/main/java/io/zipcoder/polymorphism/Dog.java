package io.zipcoder.polymorphism;

public class Dog extends Pet {

    public Dog() {
        super("Bentley");
    }
    public Dog(String name) {
        super(name);
    }
    public String speak() {
        return "bark";
    }
}
