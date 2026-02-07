package br.com.pedrodese.factory.simple_factory.model;

import java.util.logging.Logger;

//Classe concreta, que estende a classe abstrata Iphone, mas alterando seus atributos através do construtor
public class Iphone15 extends Iphone {

    private static final Logger logger = Logger.getLogger(Iphone15.class.getName());

    //Construtor com atributos do Iphone15
    public Iphone15(int storage) {
        super("iPhone 15",
                "A16 Bionic",
                6,
                storage,
                "48MP Main + 12MP Ultra Wide",
                4999.00);
    }

    //Metodo abstrato que foi herdado da classe Iphone, porem ao ser
    @Override
    public void displayInfo() {
        logger.info("=== " + getModel() + " ===");
        logger.info("Processor: " + getProcessor());
        logger.info("RAM: " + getRamMemory() + "GB");
        logger.info("Storage: " + getStorage() + "GB");
        logger.info("Camera: " + getCamera());
        logger.info("Price: $" + getPrice());
    }
}
