public class elementary extends student{
  private int avgYears;
  private int cost;

  public elementary(String name, String gender, int age, int avgYears, int cost){
    super(name,gender,age);
    this.avgYears = avgYears;
    this.cost = cost;
  }
 
  public int returnYears(){
    return avgYears;
  }

  public int cost(){
    return cost;
  }
}
