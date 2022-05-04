import processing.core.PApplet;

public class Sketch extends PApplet {

  float r = 0;
  float g = 195;
  float b = 225;
  float sunX = 750;
  float sunY = 50;
  float sunR = 250;
  float sunG = 225;
  float sunB = 0;
  float pathX = 390;
  float pathY = 650;
  String message = "";
  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;


  public void settings() {
	// size call 
    size(800, 800);

  }

  public void setup() {

  }

  public void draw() {
    // put background in draw function so it refreshes 
    background(r, g, b);
    stroke(74, 50, 1);
    fill(74, 50, 1);
    rect(0, 650, 800, 200);
    
    // sun
    stroke(0);
    fill(sunR, sunG, sunB);
    ellipse(sunX, sunY, 100, 100);

    // lawn (foreground)
    stroke(0);
    fill(22, 181, 72);
    rect(150, 650, 550, 500);

    // pathway (foreground)
    stroke(0);
    fill(130, 148, 148);
    rect(pathX, pathY, 80, 200);    
    
    // house shape
    stroke(0);
    fill(247, 186, 62);
    rect(250, 300, 350, 350);

    // roof
    stroke(0);
    fill(153, 99, 0);
    triangle(150, 300, 425, 100, 700, 300);
    
    // door
    stroke(0);
    rect(390, 550, 80, 100);
    fill(74, 50, 1);
    ellipse(460, 610, 15, 15);

    // window
    stroke(0);
    fill(185, 250, 249);
    rect(390, 350, 80, 80);
    
    line(390, 390, 470, 390);
    line(430, 350, 430, 430);

    fill(118, 15, 214);

    // create text
    text(message, 0, 25);

    // create cursor tracking circle
    if (mousePressed) {
      ellipse(mouseX, mouseY, 25, 25);
    }

    // Combining Input Variables and Event Functions
    if (upPressed) {
      sunY--;
    }
    if (downPressed) {
      sunY++;
    }
    if (leftPressed) {
      sunX--;
    }
    if (rightPressed) {
      sunX++;
    }
  }
  // Created a message variable that appends the typed key.
  public void keyTyped() {
    message += key;

  }
  // change background color with mouse release 
  public void mouseReleased() {

    r = 188;
    g = 117;
    b = 255;   
    }
  
  public void keyPressed() {

    if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    if (key == ' ') {
      sunR = 255;
      sunG = 106;
      sunB = 0;
    }
    else if (keyCode == CONTROL) {
      sunR = 250;
      sunG = 225;
      sunB = 0;
    }
  }
  public void keyReleased() {

    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
  }

  }
  // create mouse wheel
  public void mouseWheel() {

    pathX++;
  }
  // create mouseClick 
  public void mouseClicked() {
    fill(139, 186, 30);
    ellipse(mouseX, mouseY, 50, 50);
  }

}