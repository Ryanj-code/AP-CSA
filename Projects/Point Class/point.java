public class Point {

  private double x;
  private double y; // the fields/instance variables

  public Point(double x, double y) {
    this.x = x; // constructor
    this.y = y;
  }

  public String toString() {
    return "(" + x + ", " + y + ")"; // sets a return statement of string
  }

  public double getSlope(double x2, double y2) {
    return (y2 - y)/(x2 - x); // uses slope formula to calucalte slope and returns it
  }

  public double getDistance(double x2, double y2) {
    return (Math.sqrt(Math.pow((x2 - x), 2) + (Math.pow((y2 - y), 2)))); // uses distance formula to calculate the distance and returns it
  }

  public String getQuadrant() {
    String quad = ""; // intialize variable quad
    if (x == 0 || y == 0) {
      quad = "No Quadrant";
    } else if (x > 0 && y > 0) {
      quad = "First Quadrant";
    } else if (x < 0 && y > 0) {
      quad = "Second Quadrant";
    } else if (x < 0 && y < 0) {
      quad = "Third Quadrant";
    } else {
      quad = "Fourth Quadrant";
    } // check for the condition to see which quadrant
    return quad; // return quad
  }

  public String translate(String direction, double move) {
    double newX = x; // initialize variables newX and newY
    double newY = y;
    if (direction.contains("up")) {
      newY += move;
    } // if direction is up add move to y coordinates
    else if (direction.contains("down")) {
      newY -= move;
    } // if direction is down subtract move from y coordinates
    else if (direction.contains("right")) {
      newX -= move;
    } // if direction is right add move to x coordinates
    else if (direction.contains("left")) {
      newX += move;
    } // if direction is subtract move from x coordinates
    return "(" + newX + ", " + newY + ")";
  } // return the new coordinates

  public String reflection(String axis) {
    double newX = x; // intialize variables newX and newY
    double newY = y;
    if (axis.contains("y")) {
      newX = newX * -1;
    } // if axis is y, flip the x
    else if (axis.contains("x")) {
      newY = newY * -1;
    } // if axis is x, flip the y
    return "(" + newX + ", " + newY + ")";
  } //returns the new coordinates

  public boolean isCollinear(double x2, double y2, double x3, double y3) {
    if ((y2 - y) / (x2 - x) == (y3 - y) / (x3 - x)) {
      return true;
      // check if the slope between first and second point is equal to the slope
      // between the first and third point
    } else { // if condition is true return true, else return false
      return false;
    }
  }
}
