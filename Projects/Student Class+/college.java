public class college extends student{ 
  private String major;
  private int cost;

  public college(String name, String gender, int age, String major, int cost){
    super(name,gender,age);
    this.major = major;
    this.cost = cost;
  }
 
  public String returnMajor(){
    return major;
  }

  public int cost(){
    return cost;
  }
}
