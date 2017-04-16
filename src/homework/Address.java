package homework;
public class Address implements Observer {
 private String name;
 private String phone;
 private String kkt;
 private String sns;
 private Subject addressData;
 
 public Address(Subject addressData) {
  this.addressData = addressData;
  addressData.registerObserver(this);
 }
 
 public void update(String name,String phone,String kkt,String sns) {
  this.name = name;
  this.phone = phone;
  this.kkt=kkt;
  this.sns=sns;
 }

}