public class Circles extends Shapes{
  private double radius;

  public Circles(int sides, double radius){
    super(sides);
    this.radius = radius;
  }

  public String toString(){
    return "Radius : " + radius;
  }

  public double getArea(){
    return Math.PI * Math.pow(radius, 2); 
  }

  public double getPerimeter(){
    return 2 * Math.PI * radius;
  }   
}
