package br.com.pedrodese.factory.simpleFactory.model;

//Classe concreta que representa o modelo top de linha iPhone 15 Pro Max
//Herda de Iphone e implementa as características do modelo mais avançado
public class Iphone15ProMax extends Iphone {

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

    //Sobrescreve o método abstrato displayInfo() da classe pai
    //Implementa a forma específica de exibir as informações do Pro Max
    @Override
    public void displayInfo() {
        //Utiliza os métodos getters para acessar e exibir os atributos privados
        System.out.println("=== " + getModel() + " ===");
        System.out.println("Processor: " + getProcessor());
        System.out.println("RAM: " + getRamMemory() + "GB");
        System.out.println("Storage: " + getStorage() + "GB");
        System.out.println("Camera: " + getCamera());
        System.out.println("Price: $" + getPrice());
        //Destaque especial indicando que é o modelo mais premium
        System.out.println("** TOP OF THE LINE version **");
    }
}