package headfirst.factory.pizzafm;

public class SMUPizzaStore extends PizzaStore {
 Pizza createPizza(String item) {
  if (item.equals("cheese")) {
   return new SMUStyleCheesePizza();
  } 
  else if (item.equals("veggie")) {
   return new SMUStyleVeggiePizza();
  }
  else if (item.equals("clam")) {
   return new SMUStyleClamPizza();
  }
  else if (item.equals("pepperoni")) {
   return new SMUStylePepperoniPizza();
  } 
  else return null;
 }
}