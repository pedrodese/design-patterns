package br.com.pedrodese.factory.simple_factory.model;

import java.util.logging.Logger;

//Classe concreta que representa o modelo top de linha iPhone 15 Pro Max
//Herda de Iphone e implementa as características do modelo mais avançado
public class Iphone15ProMax extends Iphone {

    private static final Logger logger = Logger.getLogger(Iphone15ProMax.class.getName());

    //Construtor que recebe o armazenamento como parâmetro variável
    //Permite criar iPhone 15 Pro Max com diferentes capacidades de storage
    public Iphone15ProMax(int storage) {
        //Invoca o construtor da superclasse com os valores fixos do iPhone 15 Pro Max
        //Possui processador A17 Pro, 8GB RAM, câmera tripla com zoom 5x e preço de $9999
        super("iPhone 15 Pro Max",
                "A17 Pro",
                8,
                storage,
                "48MP Main + 12MP Ultra Wide + 12MP Telephoto (5x zoom)",
                9999.00);
    }

    //Sobrescreve o metodo abstrato displayInfo() da classe pai
    //Implementa a forma específica de exibir as informações do Pro Max
    @Override
    public void displayInfo() {
        //Utiliza os métodos getters para acessar e exibir os atributos privados
        logger.info("=== " + getModel() + " ===");
        logger.info("Processor: " + getProcessor());
        logger.info("RAM: " + getRamMemory() + "GB");
        logger.info("Storage: " + getStorage() + "GB");
        logger.info("Camera: " + getCamera());
        logger.info("Price: $" + getPrice());
        //Destaque especial indicando que é o modelo mais premium
        logger.info("** TOP OF THE LINE PRO MAX with exclusive features **");
    }
}