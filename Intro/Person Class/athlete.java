public class athlete extends person {
  private String sport;
  private String position;
  
  public athlete(double height, double weight, int age, String name, String gender, String eyeColor, String sport, String position) {
    super(height, weight, age, name, gender, eyeColor);

    this.sport = sport;
    this.position = position;
  }

  public String getSport() {
    return sport;
  }

  public String getPosition() {
    return position;
  }
}
