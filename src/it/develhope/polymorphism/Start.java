package it.develhope.polymorphism;

public class Start {
    public static void main(String[] args) {
        System.out.println("------Creating a new animal-------");

        Animal lion = new Animal();

        lion.animalSound();

        lion.animalSound("high");

        System.out.println("-----------------------------------");

    }
}
