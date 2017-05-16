package headfirst.command.undo;

public class RemoteControlWithUndo{
 // Command slot;
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;
  public RemoteControlWithUndo(){
    onCommands=new Command[7];
    offCommands=new Command[7];
    Command noCommand=new NoCommand();
    for (int i=0; i<7; i++){
      onCommands[i]=noCommand;
      offCommands[i]=noCommand;
    }
    undoCommand=noCommand;
  }
  public void setCommand(int slot,Command c_on,Command c_off){
  //slot=c;
  onCommands[slot]=c_on;
  offCommands[slot]=c_off;
  }
  public void onButtonWasPushed(int slot) {
  //slot.execute();
  onCommands[slot]. execute();
  undoCommand=onCommands[slot];
  }
  public void offButtonWasPushed(int slot) {
  offCommands[slot].execute();
  undoCommand = offCommands[slot];
 }
  
public void undoButtonWasPushed() {
  undoCommand.undo();
 }
}