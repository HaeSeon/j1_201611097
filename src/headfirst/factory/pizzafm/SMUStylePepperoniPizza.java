package headfirst.factory.pizzafm;

public class SMUStylePepperoniPizza extends Pizza {

 public SMUStylePepperoniPizza() { 
  name = "SMU Style Pepperoni Pizza";
  dough = "Regular Crust Dough";
  sauce = "Cream Sauce";
 
  toppings.add("Grated Reggiano Cheese");
  toppings.add("Shredded Mozzarella Cheese");
  toppings.add("Sliced Pepperoni");
  toppings.add("Garlic");
  toppings.add("Onion");
  toppings.add("Mushrooms");
  toppings.add("Red Pepper");
 }
}