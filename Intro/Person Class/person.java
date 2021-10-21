public class Person {
  private double height;
  private double weight;
  private int age;
  private String name;
  private String gender;
  private String eyeColor;

  public Person(double height, double weight, int age, String name, String gender, String eyeColor) {
    this.height = height;
    this.weight = weight;
    this.age = age;
    this.gender = gender;
    this.eyeColor = eyeColor;
  }

  public double getHeight() {
    return height;
  }

  public double getWeight() {
    return weight;
  }
  
  public int getAge() {
    return age;
  }
  
  public String getGender() {
    return gender;
  }

  public String getEyeColor() {
    return eyeColor;
  }
  
  public void addHeight(double change) {
    this.height += change;
  }
  
  public void setHeight(double newHeight) {
    this.height = newHeight;
  }
}
