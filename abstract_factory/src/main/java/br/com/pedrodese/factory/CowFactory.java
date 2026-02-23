package br.com.pedrodese.factory;

import br.com.pedrodese.products.animal.Animal;
import br.com.pedrodese.products.animal.Cow;
import br.com.pedrodese.products.food.CowFood;
import br.com.pedrodese.products.food.Food;

public class CowFactory implements PetShopFactory {
    @Override
    public Animal createAnimal() {
        return new Cow();
    }

    @Override
    public Food createFood() {
        return new CowFood();
    }
}
