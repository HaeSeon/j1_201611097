package headfirst.factory.pizzaaf.small;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
 
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
      name="Abstract Factory Cheese Pizza";
        this.ingredientFactory = ingredientFactory;
        toppings.add("Fresh Mozzarella");
  toppings.add("Parmesan");
    }
    protected String prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        potato=ingredientFactory.createPotato();
        return name;
    }
}