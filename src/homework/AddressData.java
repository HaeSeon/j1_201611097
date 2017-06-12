package homework;
import java.util.*;
public class AddressData implements Subject{
  public ArrayList<Observer> observers = new ArrayList<Observer>();
  private int id;
  private String name;
  private String phone;
  private String kkt;
  private String sns;
  
  public void registerObserver(Observer o) {
    observers.add(o);
  }
  
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }
  
  public void notifyObservers() {
    for (int i = 0; i < observers.size(); i++) {
      Observer observer = (Observer)observers.get(i);
      observer.update(id,name,phone,kkt,sns);
    }
  }
  
  public void measurementsChanged() {
    notifyObservers();
  }
  
  public void setMeasurements(int id,String name,String phone,String kkt,String sns) {
    this.id=id;
    this.name = name;
    this.phone = phone;
    this.kkt = kkt;
    this.sns = sns;
    measurementsChanged();
  }
  
  public int getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
  
  public String getPhone() {
    return phone;
  }
   public String getKKT() {
    return kkt;
  }
    public String getSNS() {
    return sns;
  }
}