package br.com.pedrodese.products.food;

import java.util.logging.Logger;

public class CatFood implements Food {

    private static final Logger log = Logger.getLogger(CatFood.class.getName());

    @Override
    public void serve() {
        log.info("Serving cat food: Whiskas!");
    }
}
