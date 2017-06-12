package homework;
public class PersonVO  {
  private int id;
  private String name;
  private String phone;
  private String kkt;
  private String sns;

    
    public int getId(){
      return id;
    }
    public void setId(int id){
      this.id=id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone=phone;
    }
     public String getKKT() {
        return kkt;
    }
    public void setKKT(String kkt) {
        this.kkt=kkt;
    }
     public String getSNS() {
        return sns;
    }
    public void setSNS(String sns) {
        this.sns=sns;
    }
    
    public String toString() {
      return "ID:"+id+"Name : " +name + "Phone : " +phone+ "KKT : " +kkt+"SNS:"+sns;
    }

}