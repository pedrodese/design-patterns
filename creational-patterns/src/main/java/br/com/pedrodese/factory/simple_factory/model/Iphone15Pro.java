package br.com.pedrodese.factory.simple_factory.model;

//Classe concreta que representa o modelo iPhone 15 Pro
//Estende Iphone e define características específicas deste modelo
public class Iphone15Pro extends Iphone {

    //Construtor que recebe apenas o storage (armazenamento)
    //Os demais atributos são fixos para este modelo específico
    public Iphone15Pro(int storage) {
        //Chama o construtor da classe pai (Iphone) passando os valores específicos do iPhone 15 Pro
        //Este modelo tem processador A17 Pro, 8GB RAM, câmera tripla e preço de $7999
        super("iPhone 15 Pro",
                "A17 Pro",
                8,
                storage,
                "48MP Main + 12MP Ultra Wide + 12MP Telephoto",
                7999.00);
    }

    //Implementação obrigatória do método abstrato herdado da classe Iphone
    //Define como as informações do iPhone 15 Pro serão exibidas
    @Override
    public void displayInfo() {
        //Exibe todas as especificações do dispositivo usando os getters herdados
        System.out.println("=== " + getModel() + " ===");
        System.out.println("Processor: " + getProcessor());
        System.out.println("RAM: " + getRamMemory() + "GB");
        System.out.println("Storage: " + getStorage() + "GB");
        System.out.println("Camera: " + getCamera());
        System.out.println("Price: $" + getPrice());
        //Mensagem adicional específica para a versão Pro
        System.out.println("** PRO version with advanced features **");
    }
}