package br.com.pedrodese.products.animal;

import java.util.logging.Logger;

public class Dog implements Animal {

    private static final Logger log = Logger.getLogger(Dog.class.getName());

    @Override
    public void makeSound() {
        log.info("Dog says: Woof!");
    }
}
