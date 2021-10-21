public class Triangles extends Shapes{
  private int sideA;
  private int sideB;
  private int sideC;

  public Triangles(int sides, int sideA, int sideB, int sideC){
    super(sides);
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  public String toString(){
    return "Side A : " + sideA +"\nSide B : " + sideB + "\nSide C : " + sideC;
  }

  public int getPerimeter(){
    return sideA + sideB + sideC;
  }

  public String getType(){
    if(sideA == sideB && sideB == sideC){
      return "Equilateral Triangle";
    }
    else if(sideA != sideB && sideA != sideC && sideB != sideC)
      return "Scalene Triangle";
    else{
      return "Isosceles Triangle";
    }
  }
}
