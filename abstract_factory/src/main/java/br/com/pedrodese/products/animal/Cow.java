package br.com.pedrodese.products.animal;

import java.util.logging.Logger;

public class Cow implements Animal {

    private static final Logger log = Logger.getLogger(Cow.class.getName());

    @Override
    public void makeSound() {
        log.info("Cow says: Mooo!");
    }
}
