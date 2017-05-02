package headfirst.factory.pizzaaf.small;
import java.util.ArrayList;
public abstract class Pizza {
    String name;
    Dough dough;
    Cheese cheese;
    Potato potato;
 ArrayList<String> toppings = new ArrayList<String>();
 protected abstract String prepare();


 public void bake() {
  System.out.println("Baking " + name);
 }

 public void cut() {
  System.out.println("Cutting " + name);
 }

 public void box() {
  System.out.println("Boxing " + name);
 }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (potato != null) {
            result.append(potato);
            result.append("\n");
        }
        return result.toString();
    }
}