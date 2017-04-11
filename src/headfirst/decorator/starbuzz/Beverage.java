package headfirst.decorator.starbuzz;

public abstract class Beverage{
  String description="Unknown bevarage";
    public String getDescription(){
    return description;
  }
  public abstract double cost();
}