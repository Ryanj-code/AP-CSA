public class high extends student{
  private int avgYears;
  private int cost;

  public high(String name, String gender, int age, int avgYears, int cost, int scoreSAT){
    super(name,gender,age);
    this.avgYears = avgYears;
    tis.cost = cost;
    this.scoreSAT = scoreSAT;
  }
 
  public int returnYears(){
    return avgYears;
  }

  public int cost(){
    return cost;
  }

  public int scoreSAT(){
    return scoreSAT;
  }
}
