package br.com.pedrodese.factory;

import br.com.pedrodese.products.animal.Animal;
import br.com.pedrodese.products.food.Food;

public interface PetShopFactory {
    Animal createAnimal();
    Food createFood();
}
