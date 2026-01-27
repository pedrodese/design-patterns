package br.com.pedrodese.factory.simple_factory.model;

//Classe concreta, que estende a classe abstrata Iphone, mas alterando seus atributos através do construtor
public class Iphone15 extends Iphone {

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
        System.out.println("=== " + getModel() + " ===");
        System.out.println("Processor: " + getProcessor());
        System.out.println("RAM: " + getRamMemory() + "GB");
        System.out.println("Storage: " + getStorage() + "GB");
        System.out.println("Camera: " + getCamera());
        System.out.println("Price: $" + getPrice());
    }
}