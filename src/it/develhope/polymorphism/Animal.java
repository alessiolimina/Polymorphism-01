package it.develhope.polymorphism;

public class Animal {
    public String animalName;

    public Animal() {
        this.animalName = "Lion";
        System.out.println("This animal is called " + animalName);
    }

    public void animalSound() {
        System.out.println("Roarrr!");
    }

    public void animalSound(String intensity) {
        if (intensity.equals("high") ) {
            System.out.println("Roarrrrrrr!!!");
        } else if (intensity.equals("low")) {
            System.out.println("Roar");
        } else {
            System.out.println("Cannot reproduce it properly");
        }
    }
}

