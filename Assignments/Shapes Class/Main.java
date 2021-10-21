import java.util.*;

class Main {
  public static void main(String[] args) {
    Triangles t = new Triangles(3, 3, 4, 5);
    Circles c = new Circles(0, 5);
    Quadrilaterals q= new Quadrilaterals(4, 4, 8);

    System.out.println(t.getPerimeter());
    System.out.println(t.getType());
    System.out.println(t.toString());

    System.out.println(c.getPerimeter());
    System.out.println(c.getArea());
    System.out.println(c.toString());

    System.out.println(q.getArea());
    System.out.println(q.getPerimeter());
    System.out.println(q.toString());
  }
}
