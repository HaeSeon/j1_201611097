package headfirst.singleton.chocolate;

public class ChocolateBoiler{
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueinstance;
  private static int numCalled=0;
  
  private ChocolateBoiler(){
  empty=true;
  boiled=false;
  }
  public static ChocolateBoiler getInstance(){
    if(uniqueinstance==null){
      System.out.println("creating...");
    uniqueinstance=new ChocolateBoiler();
    }
    System.out.println("returning...");
    System.out.println("num called..."+numCalled++);
      return uniqueinstance;
  }
  public void fill(){
    if(isEmpty()){
    empty=false;
    boiled=false;}
  }
  
  public void drain() {
  if (!isEmpty() && isBoiled()) {
   empty = true;
  }
 }
  
  public void boil() {
  if (!isEmpty() && !isBoiled()) {
   // bring the contents to a boil
   boiled = true;
  }
 }
  
  public boolean isEmpty() {
  return empty;
 }
  public boolean isBoiled() {
  return boiled;
 }
}