package headfirst.strategy;

public class MallardDuck extends Duck {
  public MallardDuck(){
    //fb=new FlyWithWings();
    setFlyBehavior(new FlyWithWings());
    setFlyBehavior(new FlyRocketPowered());
    setQuackBehavior(new Quack());
  }
  public void display(){
    System.out.println("I'm a mallard duck");
  }
}