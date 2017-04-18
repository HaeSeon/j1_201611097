package headfirst.factory.pizzafm;

public class SMUStyleClamPizza extends Pizza {

 public SMUStyleClamPizza() { 
  name = "SMU Style Clam Pizza";
  dough = "Rggular Crust Dough";
  sauce = "Cream Sauce";
 
  toppings.add("Grated Reggiano Cheese");
  toppings.add("Shredded Mozzarella Cheese");
  toppings.add("Fresh Clams from Long Island Sound");
 }
}