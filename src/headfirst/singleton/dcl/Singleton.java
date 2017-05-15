package headfirst.singleton.dcl;

public class Singleton{
  private static Singleton uniqueinstance;
  private static int numCalled=0;
  
  private Singleton(){
  }
 // public static synchronized Singleton getInstance(){
   public static Singleton getInstance(){
  if(uniqueinstance==null){
     synchronized(Singleton.class){
       if(uniqueinstance==null){
    System.out.println("creating...");
   uniqueinstance=new Singleton();
        }
    }
  }
    System.out.println("returning...");
    System.out.println("num called..."+numCalled++);
      return uniqueinstance;
  }

}