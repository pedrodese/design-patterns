# Design Patterns — Implementado em Java

Repositório de implementações práticas de Design Patterns em Java, criado para fins de estudo.  
Cada pattern fica em seu próprio módulo Maven, com um exemplo concreto e autocontido.

---

## Padrões implementados - Criacionais


## Abstract Factory

**Intenção:** fornecer uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas.

**Quando usar:**
- Quando o sistema precisa criar objetos que pertencem a uma mesma família e devem ser usados juntos (ex: `Animal` + `Food` compatíveis).
- Quando você quer isolar o código cliente da criação concreta dos objetos.
- Quando adicionar uma nova variante deve ser feito sem modificar o código existente (Open/Closed Principle).

### Estrutura do exemplo

```
PetShopFactory          ← AbstractFactory (interface)
├── DogFactory          ← ConcreteFactory — cria Dog + DogFood
├── CatFactory          ← ConcreteFactory — cria Cat + CatFood
└── CowFactory          ← ConcreteFactory — cria Cow + CowFood

Animal                  ← AbstractProduct (interface)
├── Dog
├── Cat
└── Cow

Food                    ← AbstractProduct (interface)
├── DogFood
├── CatFood
└── CowFood

Main (Client)           ← usa apenas PetShopFactory, Animal e Food
```

### Ponto-chave da implementação

O `Main` (client) nunca instancia `Dog`, `Cat` ou qualquer produto diretamente.  
Ele recebe uma `PetShopFactory` e chama `createAnimal()` / `createFood()` — garantindo que o animal e a comida entregues sempre sejam compatíveis entre si.

```java
PetShopFactory factory = getFactory(clientChoice); // DogFactory, CatFactory...
Animal animal = factory.createAnimal();             // cliente não conhece Dog, Cat...
Food food = factory.createFood();                   // ...nem DogFood, CatFood
```

**Para adicionar um novo animal** (ex: Chicken), basta criar `ChickenFactory`, `Chicken` e `ChickenFood` — sem tocar no client nem nas outras fábricas.