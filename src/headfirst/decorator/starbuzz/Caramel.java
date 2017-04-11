package headfirst.decorator.starbuzz;

public class Caramel extends CondimentDecorator {
 Beverage beverage;
 
 public Caramel(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", Caramel";
 }
 
 public double cost() {
  return .20 + beverage.cost();
 }
}