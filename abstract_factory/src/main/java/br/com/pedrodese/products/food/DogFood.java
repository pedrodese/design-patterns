package br.com.pedrodese.products.food;

import java.util.logging.Logger;

public class DogFood implements Food {

    private static final Logger log = Logger.getLogger(DogFood.class.getName());

    @Override
    public void serve() {
        log.info("Serving dog food: Pedigree!");
    }
}
