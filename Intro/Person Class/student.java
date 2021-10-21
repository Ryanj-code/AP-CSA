public class Student extends Person {

  private double gradeAverage;
  private String schedule;
  private int IDNumber;

  public Student(double height, double weight, int age, String name, String gender, String eyeColor, double gradeAverage, String schedule, int IDNumber) {
    super(height, weight, age, name, gender, eyeColor);

    this.gradeAverage = gradeAverage;
    this.schedule = schedule;
    this.IDNumber = IDNumber;
  }

  public double getAverage() {
    return this.gradeAverage;
  }
  public String getSchedule() {
    return this.schedule;
  }
  public int getIDNumber() {
    return this.IDNumber;
  }
}
