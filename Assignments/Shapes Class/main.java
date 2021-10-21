import java.util.*;

class Main {
  public static void main(String[] args) {
    triangles t = new triangles(3, 3, 4, 5);
    circles c = new circles(0, 5);
    quadrilateral q= new quadrilateral(4, 4, 8);

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
