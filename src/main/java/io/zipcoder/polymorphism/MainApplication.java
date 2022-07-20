package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int number = numberOfPets(scanner);
        Pet[] pets = petTypeName(scanner, number);
        System.out.println(petSpeaks(pets));
    }

    public static int numberOfPets(Scanner scanner) {
        System.out.println("How many pets do you own?");
        return scanner.nextInt();
    }
    private static Pet[] petTypeName(Scanner scanner, Integer amount) {
        Pet[] numberOfPets = new Pet[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("What kind of pet is it?");
            Pet pet = makePet(scanner.next());
            System.out.println("What is the name of your pet?");
            assert pet != null;
            pet.setName(scanner.next());
            numberOfPets[i] = pet;
        }
        return numberOfPets;
    }

    private static Pet makePet(String typePet) {
        return switch (typePet) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            case "bird" -> new Bird();
            default -> null;
        };
    }

    public static String petSpeaks(Pet[] pets) {
        StringBuilder results = new StringBuilder();
        for (Pet pet : pets)
            results.append(String.format("%s the %s says %s \n", pet.getName(), typeOfPetInString(pet), pet.speak()));
        return results.substring(0, results.length() -1);
    }
    public static String typeOfPetInString(Pet pet) {
        if (pet instanceof Cat) return "cat";
        else if (pet instanceof Dog) return "dog";
        else if (pet instanceof Bird) return "bird";
        else return null;
    }
}
