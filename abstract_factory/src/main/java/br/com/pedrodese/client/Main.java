package br.com.pedrodese.client;

import br.com.pedrodese.factory.CatFactory;
import br.com.pedrodese.factory.CowFactory;
import br.com.pedrodese.factory.DogFactory;
import br.com.pedrodese.factory.PetShopFactory;
import br.com.pedrodese.products.animal.Animal;
import br.com.pedrodese.products.food.Food;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        log.info("=== Welcome to PetShop ===\n");
        log.info("What pet do you want?");
        log.info("1 - Dog");
        log.info("2 - Cat");
        log.info("3 - Cow");
        log.info("\nYour choice: ");

        int clientChoice = scanner.nextInt();

        PetShopFactory factory = getFactory(clientChoice);
        processOrder(factory);
    }

    private static void processOrder(PetShopFactory factory) {
        log.info("Processing your order...\n");

        Animal animal = factory.createAnimal();
        Food food = factory.createFood();

        log.info("Your pet: ");
        animal.makeSound();

        log.info("\n Your pet's food: ");
        food.serve();
    }

    private static PetShopFactory getFactory(int choice) {
        return switch (choice) {
            case 1 -> new DogFactory();
            case 2 -> new CatFactory();
            case 3 -> new CowFactory();
            default -> throw new IllegalStateException("Invalid value: " + choice);
        };
    }
}