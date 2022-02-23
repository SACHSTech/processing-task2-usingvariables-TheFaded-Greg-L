import processing.core.PApplet;
/*
-------------------------------------------------------------------------------
Name:		Sketch.java
Purpose:	Calling Functions 5.2 Processing Task

Author:	Lui.G

Created:	2022-02-16
------------------------------------------------------------------------------
*/
public class Sketch extends PApplet {
  public float blockX = 40;
  public float blockY = 50;
  public boolean end = false;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    int totalArea = 1000;
    size(totalArea, totalArea);

  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {

    background(104, 143, 212);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
      if(blockX+(width/(width/50)) >= width){
       
        blockX-=5;
      }

      if(blockX <= 0){

        blockX+=5;
      }

      if(blockY+(height/(height/50)) == height){

        blockY--;
      }

      if(blockY == 0){

        blockY++;
      }

      background(104, 143, 212);
      rect(blockX, blockY, width/(width/50),height/(height/50));
  }
}