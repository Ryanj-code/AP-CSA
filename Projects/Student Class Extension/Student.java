public class Student{
  private String name;
  private String gender;
  private int age;

  public Student(String name, String gender, int age){
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public String toString(){
    return "Name : " + name + "\nGender : " + gender + "\nAge : " + age;
  }

  public double getAvg(double a, double b, double c, double d, double e){
    return (a + b + c + d + e)/5;  
  }
}
