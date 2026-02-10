package br.com.pedrodese.factory;

import br.com.pedrodese.products.animal.Animal;
import br.com.pedrodese.products.animal.Dog;
import br.com.pedrodese.products.food.DogFood;
import br.com.pedrodese.products.food.Food;

public class DogFactory implements PetShopFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }

    @Override
    public Food createFood() {
        return new DogFood();
    }
}
