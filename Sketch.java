import processing.core.PApplet;
/*
-------------------------------------------------------------------------------
Name:		Sketch.java
Purpose:	Using Variables 5.3 Processing Task 2

Author:	Lui.G

Created:	2022-02-22
------------------------------------------------------------------------------
*/
public class Sketch extends PApplet {
  //global variables
  public float shapesBounce = 0;

  //shape one variables
  public float shapeOneX = width/2;
  public float shapeOneY = height/3;

  public float shapeOneWidth = width/5;
  public float shapeOneHeight = height/5;

  public float shapeOneSpeedX = width/25;
  public float shapeOneSpeedY = height/25;

  //shape two variables
  public float shapeTwoX = width-(width/3);
  public float shapeTwoY = height+100;

  public float shapeTwoWidth = width/10;
  public float shapeTwoHeight = height/10;

  public float shapeTwoSpeedX = width/25;
  public float shapeTwoSpeedY = height/20;

  public double shapeTwoAccelerationX = -1.005;
  public double shapeTwoAccelerationY = -1.005;

  //shape three variables
  public float shapeThreeX = width-(width/3);
  public float shapeThreeY = height+100;

  public float shapeThreeWidth = width/4;
  public float shapeThreeHeight = height/6;

  public float shapeThreeSpeedX = width/15;
  public float shapeThreeSpeedY = height/5;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(690, 420);

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
    background(104, 143, 212);
    textSize(10);
    fill(0, 0, 0);
    text(shapeTwoSpeedX, 15, 110);
    text(shapeTwoSpeedY, 15, 125);
    textSize(128);
    fill(0, 0, 0);
    text((int) shapesBounce, 15, 100);

    shapeOne();

    //if shape one bounces 15 times start drawing the second shape
    if(shapesBounce >= 15){

      shapeTwo();
    }

    //if the two shapes bounce 45 times start drawing the third shape
    if(shapesBounce >= 45){

      shapeThree();
    }
  }
  public void shapeOne(){
    
    shapeOneX += shapeOneSpeedX;
    shapeOneY += shapeOneSpeedY;

    if(shapeOneX+shapeOneWidth > width || shapeOneX < 0){
      
      shapeOneSpeedX *= -1;
      shapesBounce += 1;
    }

    if(shapeOneY+shapeOneHeight > height || shapeOneY < 0){

      shapeOneSpeedY *= -1;
      shapesBounce += 1;
    }

    fill(27, 70, 209);
    rect(shapeOneX, shapeOneY, shapeOneWidth, shapeOneHeight, 100);
  }

  public void shapeTwo(){

    shapeTwoX += shapeTwoSpeedX;
    shapeTwoY += shapeTwoSpeedY;

    if(shapeTwoX+shapeTwoWidth > width || shapeTwoX < 0){
      
      shapeTwoSpeedX *= shapeTwoAccelerationX;
      shapesBounce += 1;
    }

    if(shapeTwoY+shapeTwoHeight > height || shapeTwoY < 0){

      shapeTwoSpeedY *= shapeTwoAccelerationY;
      shapesBounce += 1;
    }

    fill(27, 224, 76);
    rect(shapeTwoX, shapeTwoY, shapeTwoWidth, shapeTwoHeight, 100);
  }
  
  public void shapeThree(){

    shapeThreeX += shapeThreeSpeedX;
    shapeThreeY += shapeThreeSpeedY;

    if(shapeThreeX+shapeThreeWidth > width || shapeThreeX < 0){
      
      shapeThreeSpeedX *= -1;
      shapesBounce += 1;
    }

    if(shapeThreeY+shapeThreeHeight > height || shapeThreeY < 0){

      shapeThreeSpeedY *= -1;
      shapesBounce += 1;
    }

    fill(214, 4, 85);
    rect(shapeThreeX, shapeThreeY, shapeThreeWidth, shapeThreeHeight, 100);
  }
}