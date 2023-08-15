import java.awt.Color;

/**
 * Course: ISTE-120
 * Exam: Practical 1, Question #1
 * Description: TV - A class to draw a TV set
 * @author Klara Makek
 * @version 30.9.2022.
 */
public class TV {
    public static void main(String[] args) throws Exception {
    
 //Making a new canvas
 Canvas canvas = new Canvas("TV", 500, 500);
 
 /*
  * Drawing of the tv
  */
  // rectangle tv whole
  Rectangle back1 = new Rectangle(40, 150, 400, 250, Color.BLACK, true);
  //rectangle screan
  Rectangle screan = new Rectangle(50, 160, 300, 230, Color.RED, true);

  //Triangle buttons
  Triangle gre1 = new Triangle(365, 340, 40, 25, Color.GREEN, true);
  Triangle gre2 = new Triangle(365, 300, 40, 25, Color.GREEN, true);

  //circle legs
  Circle blu1 = new Circle(120, 400, 20, Color.BLUE, true);
  Circle blu2 = new Circle(280, 400, 20, Color.BLUE, true);

  //circle antenas
  Circle yel1 = new Circle(130, 85, 15, Color.YELLOW, true);
  Circle yel2 = new Circle(280, 85, 15, Color.YELLOW, true);
  // tines for the antena
  Line tel1 = new Line(220, 150, 160, 110, Color.BLACK);
  Line tel2 = new Line(280, 110, 220, 150, Color.BLACK);

  //White lines on the sides of the tv
  Line whi1 = new Line(365, 190, 415, 190, Color.WHITE);
  Line whi2 = new Line(365, 200, 415, 200, Color.WHITE);
  Line whi3 = new Line(365, 210, 415, 210, Color.WHITE);
  Line whi4 = new Line(365, 220, 415, 220, Color.WHITE);
  Line whi5 = new Line(365, 230, 415, 230, Color.WHITE);
  Line whi6 = new Line(365, 240, 415, 240, Color.WHITE);

//text on the screan
  DrawableString text = new DrawableString("RIT Croatia presents", 180, 340, Color.BLACK);
  
//Printing tv...
  canvas.draw(back1);
  canvas.draw(screan);
  canvas.draw(gre1);
  canvas.draw(gre2);
  canvas.draw(blu1);
  canvas.draw(blu2);
  canvas.draw(yel1);
  canvas.draw(yel2);
  canvas.draw(whi1);
  canvas.draw(whi2);
  canvas.draw(whi3);
  canvas.draw(whi4);
  canvas.draw(whi5);
  canvas.draw(whi6);
  canvas.draw(tel1);
  canvas.draw(tel2);
  canvas.draw(text);
  
}}
