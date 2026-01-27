package br.com.pedrodese.factory.simple_factory.factory;

import br.com.pedrodese.factory.simple_factory.model.*;

//Classe responsável por encapsular a lógica de criação dos objetos iPhone
//Implementa o padrão Simple Factory (Static Factory Method)
public class IphoneFactory {

    private IphoneFactory() {}

    //Metodo estático que cria e retorna instâncias de iPhone baseado no modelo solicitado
    //Recebe o nome do modelo e a capacidade de armazenamento como parâmetros
    //Retorna um objeto do tipo Iphone (classe abstrata), mas instancia as classes concretas
    public static Iphone createIphone(String model, int storage) {
        //Switch que determina qual classe concreta instanciar baseado no modelo solicitado
        return switch (model) {
            case "iphone 15" -> new Iphone15(storage); //Cria e retorna uma instância de Iphone15 com o storage especificado
            case "iphone 15 pro" -> new Iphone15Pro(storage); //Cria e retorna uma instância de Iphone15Pro com o storage especificado
            case "iphone 15 pro max" -> new Iphone15ProMax(storage);  //Cria e retorna uma instância de Iphone15ProMax com o storage especificado
            default -> throw new IllegalArgumentException("Unknown model: " + model);
        };
    }
}