package headfirst.strategy;

public abstract class Duck {
  private FlyBehavior fb;
  private QuackBehavior qb;
  
  public void setFlyBehavior(FlyBehavior f){
    this.fb=f;
  }
  
  public void setQuackBehavior(QuackBehavior q){
    this.qb=q;
  }
  
  public void performFly(){
    fb.fly();
    System.out.println("All ducks fly");
  }
  
  public void performQuack(){
    qb.quack();
    System.out.println("All ducks say quack");
  }
  
  abstract void display();
  
  public void swim() {
    System.out.println("All ducks swim");
  }
}