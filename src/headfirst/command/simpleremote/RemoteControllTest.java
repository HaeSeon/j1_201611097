package headfirst.command.simpleremote;

public class RemoteControllTest{
  public static void main(String[] args){
  SimpleRemoteControll remote = new SimpleRemoteControll();
        Light light = new Light();        
        LightOnCommand lightOn = new LightOnCommand(light);      
 
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.buttonWasPressed();
  
  }
}