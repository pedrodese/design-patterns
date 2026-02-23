package br.com.pedrodese.products.food;

import java.util.logging.Logger;

public class CowFood implements Food {

    private static final Logger log = Logger.getLogger(CowFood.class.getName());

    @Override
    public void serve() {
        log.info("Serving cow food: Grass!");
    }
}
