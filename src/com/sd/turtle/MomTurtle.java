package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import java.awt.Color;
import ch.aplu.turtle.*;
class MomTurtle extends Turtle implements Observer {
    Double babyCurpos;
    public MomTurtle() {
        //setColor(Color.red);
        //label("mom turtle");
    }
    public void update(Observable o, Object arg) {
      babyCurpos=((BabyTurtle)o).myCurpos;
      moveTo(babyCurpos);
        //System.out.println("update() called, count is " + ((Integer)arg).intValue()); 
        //System.out.println("current pos" + babyCurpos);
       
    }
}