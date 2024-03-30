package us.mattgreen;

import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CreateAnimal {
    Scanner scanner = new Scanner(System.in);
    String userResponse;
    String animalName;
    boolean validInput = false;
    public Talkable animalCreation(){
        while (!validInput) {
            System.out.println("What animal do you want to create?");
            System.out.println("dog, cat, or teacher");

            userResponse = scanner.nextLine();
            switch (userResponse.toLowerCase()) {
                case "dog" -> {
                    System.out.println("What is the name of the dog?");
                    animalName = scanner.nextLine();
                    System.out.println("Is the dog friendly?");
                    System.out.println("y/n");
                    userResponse = scanner.nextLine();
                    if (userResponse.equals("y")) {
                        return new Dog(true, animalName);
                    } else if (userResponse.equals("n")) {
                        return new Dog(false, animalName);
                    }
                }
                case "cat" -> {
                    System.out.println("What is the name of the cat?");
                    animalName = scanner.nextLine();
                    System.out.println("How many mice has the cat killed?");
                    return new Cat(scanner.nextInt(), animalName);
                }
                case "teacher" -> {
                    System.out.println("What is the name of the teacher?");
                    animalName = scanner.nextLine();
                    System.out.println("How old is the teacher?");
                    return new Teacher(scanner.nextInt(), animalName);
                }

            }
            System.out.println("That's not an valid response. Please try again.");

        }
        System.out.println("x");
        return null;
    }

}
