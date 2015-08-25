import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
  size(500,500);
}
int shrekX = 1;
int shrekY = 2; 
public void draw()
{
  background(20,30,40);
  shrekFace();
 }
public void shrekFace()
{
   fill(159,251,0);
   ellipse(shrekX+250,shrekY+250,340,350);
   bezier(50,90,50,60,100,90,150,150);
   
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
