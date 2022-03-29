import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.lang.Math; 
import java.util.List; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Hitomezashi_Stitch_Pattern extends PApplet {




drawline alpha;

public void setup() {
  background(255);
  frameRate(1);
  
  alpha = new drawline();
  alpha.linebuilder(1, 500);
}

public void draw() {
  background(255);
  alpha = new drawline();
  alpha.linebuilder(1, 500);
}
class drawline {

  drawline() {
  }

  public void linebuilder(int startpos, int sizegrid) {
    int startrowlines = sizegrid, startcolumnlines = startrowlines, origin = -1000;

    pushMatrix();
    translate(origin, origin);
    rotate(radians(0));
    //circle(0, 0, 10);
    for (int j = 0; j <= startcolumnlines; j++) {
      //print(j);
      startpos = PApplet.parseInt(random(2));
      for (int i = 0; i <= startrowlines; i++) {
        //print(i,"  ");
        if (startpos == 1 && i%2 == 1) {
          //odds
          line ((10*i)+(j*5), (8.66025f*j), (10*i)+10+(j*5), (8.66025f*j));
        } else if (startpos == 0 && i%2 == 0) {
          line ((10*i)+(j*5), (8.66025f*j), (10*i)+10+(j*5), (8.66025f*j));
          //evens
        }
      }
      startrowlines--;
    }
    popMatrix();

    startrowlines = sizegrid; 
    startcolumnlines = startrowlines;
    pushMatrix();
    translate(origin+(10*(sizegrid+1)), origin);
    rotate(radians(120));
    //circle(0, 0, 10);
    for (int j = 0; j <= startcolumnlines; j++) {
      //print(j);
      startpos = PApplet.parseInt(random(2));
      for (int i = 0; i <= startrowlines; i++) {
        //print(i, "  ");
        if (startpos == 1 && i%2 == 1) {
          //odds
          line ((10*i)+(j*5), (8.66025f*j), (10*i)+10+(j*5), (8.66025f*j));
        } else if (startpos == 0 && i%2 == 0) {
          line ((10*i)+(j*5), (8.66025f*j), (10*i)+10+(j*5), (8.66025f*j));
          //evens
        }
        random(1);
      }
      startrowlines--;
    }
    popMatrix();  

    startrowlines = sizegrid; 
    startcolumnlines = startrowlines; 
    //print(sqrt(0.75*(10*(sizegrid+1))*(10*(sizegrid+1))));
    pushMatrix();
    translate((origin+(10*(sizegrid+1))/2), origin+sqrt(0.75f*(10*(sizegrid+1))*(10*(sizegrid+1))));
    rotate(radians(240));
    //circle(0, 0, 10);
    for (int j = 0; j <= startcolumnlines; j++) {
      //print(j);
      startpos = PApplet.parseInt(random(2));
      //print(startpos);
      for (int i = 0; i <= startrowlines; i++) {
        //print(i, "  ");
        if (startpos == 1 && i%2 == 1) {
          //odds
          line ((10*i)+(j*5), (8.66025f*j), (10*i)+10+(j*5), (8.66025f*j));
        } else if (startpos == 0 && i%2 == 0) {
          line ((10*i)+(j*5), (8.66025f*j), (10*i)+10+(j*5), (8.66025f*j));
          //evens
        }
      }
      startrowlines--;
    }
    popMatrix();
  }
}
  public void settings() {  size(1000, 1000); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Hitomezashi_Stitch_Pattern" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
