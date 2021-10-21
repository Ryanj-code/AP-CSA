import java.util.*;

class Main {

  public static void main(String[] args) {
    int x = 0;
    int y = 1;
    point pt = new point(x, y);
    
    System.out.println("The point is " + pt.toString());
    System.out.println(pt.getSlope(4,5));
    System.out.println(pt.getDistance(4,5));
    System.out.println(pt.getQuadrant());
    System.out.println(pt.translate("right", 2));
    System.out.println(pt.reflection("x"));
    System.out.println(pt.isCollinear(2, 2, 3, 3));
  }
}
