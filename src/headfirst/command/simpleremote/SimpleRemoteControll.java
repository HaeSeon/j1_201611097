package headfirst.command.simpleremote;

public class SimpleRemoteControll{
  Command slot;
  public void setCommand(Command c){
  slot=c;
  }
  public void buttonWasPressed() {
  slot.execute();
  }
}