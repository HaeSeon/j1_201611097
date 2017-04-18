package headfirst.factory.pizzafm;

public class PizzaTestDrive { 
 public static void main(String[] args) {
  PizzaStore nyStore = new NYPizzaStore();
  PizzaStore chicagoStore = new ChicagoPizzaStore();
  PizzaStore smuStore = new SMUPizzaStore();
  
  Pizza pizza = nyStore.orderPizza("cheese");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
  
  pizza = chicagoStore.orderPizza("cheese");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");
  
  pizza = smuStore.orderPizza("cheese");
  System.out.println("Haeseon ordered a " + pizza.getName() + "\n");
 
  
  pizza = nyStore.orderPizza("clam");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
  
  pizza = chicagoStore.orderPizza("clam");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");
  
  pizza = smuStore.orderPizza("clam");
  System.out.println("Haeseon ordered a " + pizza.getName() + "\n");
 
  
  pizza = nyStore.orderPizza("pepperoni");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
  
  pizza = chicagoStore.orderPizza("pepperoni");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");
  
  pizza = smuStore.orderPizza("pepperoni");
  System.out.println("Haeseon ordered a " + pizza.getName() + "\n");
 
  
  pizza = nyStore.orderPizza("veggie");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
  
  pizza = chicagoStore.orderPizza("veggie");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");
  
  pizza = smuStore.orderPizza("veggie");
  System.out.println("Haeseon ordered a " + pizza.getName() + "\n");
 
 }
}