public class Quadrilaterals extends Shapes{
  
  private static double length;
  private static double width;
  
  public Quadrilaterals(int sides, double length, double width){
    super(sides);
    this.length = length;
    this.width = width;
  }

  public String toString(){
    return "Length : " + length + "\nWidth : " + width;
  }

  public double getArea(){
    return length * width;
  }

  public double getPerimeter(){
    return (length + width) * 2;
  }
}
