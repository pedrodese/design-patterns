package br.com.pedrodese.factory;

import br.com.pedrodese.products.animal.Animal;
import br.com.pedrodese.products.animal.Cat;
import br.com.pedrodese.products.food.CatFood;
import br.com.pedrodese.products.food.Food;

public class CatFactory implements PetShopFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }

    @Override
    public Food createFood() {
        return new CatFood();
    }
}
