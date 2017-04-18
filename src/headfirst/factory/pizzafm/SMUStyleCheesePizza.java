package headfirst.factory.pizzafm;

public class SMUStyleCheesePizza extends Pizza {

 public SMUStyleCheesePizza() { 
  name = "SMU Style Sauce and Cheese Pizza";
  dough = "Regular Crust Dough";
  sauce = "Cream Sauce";
 
  toppings.add("Grated Reggiano Cheese");
  toppings.add("Shredded Mozzarella Cheese");
 }
}