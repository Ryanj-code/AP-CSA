public class Main {
  
  public static void main(String[] args) {
   drawHappyFace();
   drawSadFace();
   drawTapedFace();
  } // Calls out the methods. 
   
  public static void drawHappyFace() {
    drawFace();
    drawSmile();
    System.out.println();
  } // Defines the method with other methods.

  public static void drawTapedFace() {
    drawFace();
    drawDuctTape();
    System.out.println();
  } // Defines the method with other methods.

  public static void drawSadFace() {
    drawFace();
    drawFrown();
    System.out.println();
  } // Defines the method with other methods.

  public static void drawFace() {
    System.out.println("  .  .  ");
    System.out.println("        ");
  } // Draws a face with print statements.  

  public static void drawSmile() {
    System.out.println(" _     _  ");
    System.out.println("  -----   ");
  } // Draws a smile with print statements.

  public static void drawFrown() {
    System.out.println(" _-----_  ");
  } // Draws a frown with print statements.

  public static void drawDuctTape() {
    System.out.println(" ======  ");
  } // Draws a duct taped face with print statements.

}
