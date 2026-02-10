package br.com.pedrodese.products.animal;

import java.util.logging.Logger;

public class Cat implements Animal {

    private static final Logger log = Logger.getLogger(Cat.class.getName());

    @Override
    public void makeSound() {
        log.info("Cat says: Meow!");
    }
}
