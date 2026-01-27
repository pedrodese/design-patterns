package br.com.pedrodese.factory.simple_factory.model;

//Classe abstrata que serve como base para todos os modelos de iPhone
public abstract class Iphone {
    //Atributos privados que serão herdados por todas as classes concretas
    private final String model;
    private final String processor;
    private final int ramMemory;
    private final int storage;
    private final String camera;
    private final double price;

    //Construtor que recebe todos os atributos e inicializa o objeto
    //Este construtor será chamado pelas subclasses através do super()
    public Iphone(String model, String processor, int ramMemory,
                  int storage, String camera, double price) {
        this.model = model;
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.storage = storage;
        this.camera = camera;
        this.price = price;
    }

    //Metodo abstrato que obriga todas as subclasses a implementarem sua própria versão
    //Cada modelo de iPhone terá sua forma específica de exibir informações
    public abstract void displayInfo();

    //Métodos getters para acessar os atributos privados
    //Permitem que as subclasses e outras classes leiam os valores
    public String getModel() { return model; }
    public String getProcessor() { return processor; }
    public int getRamMemory() { return ramMemory; }
    public int getStorage() { return storage; }
    public String getCamera() { return camera; }
    public double getPrice() { return price; }
}