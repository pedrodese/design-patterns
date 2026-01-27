package br.com.pedrodese.factory.simple_factory.client;

import br.com.pedrodese.factory.simple_factory.factory.IphoneFactory;
import br.com.pedrodese.factory.simple_factory.model.Iphone;

//Classe principal que demonstra o uso do padrão Simple Factory
public class Client {
    public static void main(String[] args) {
        //Cliente utiliza apenas a factory para criar objetos
        //Não precisa conhecer as classes concretas (Iphone15, Iphone15Pro, etc)
        //Isso demonstra o princípio de encapsulamento e baixo acoplamento

        //Cria um iPhone 15 com 128GB de armazenamento
        Iphone iphone1 = IphoneFactory.createIphone("iPhone 15", 128);

        //Cria um iPhone 15 Pro com 256GB de armazenamento
        Iphone iphone2 = IphoneFactory.createIphone("iPhone 15 pro", 256);

        //Cria um iPhone 15 Pro Max com 512GB de armazenamento
        Iphone iphone3 = IphoneFactory.createIphone("iPhone 15 pro max", 512);

        //Exibe as informações de cada iPhone criado
        //Chama o metodo displayInfo() que foi implementado em cada classe concreta
        iphone1.displayInfo();
        System.out.println(); //Linha em branco para separação visual

        iphone2.displayInfo();
        System.out.println();

        iphone3.displayInfo();
    }
}