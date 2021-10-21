public class student{
  
  private String name;
  private int gradeLvl;
  private int[] grades;
  private double average;

  public student(String name, int gradeLvl, int[] grades){
    this.name = name;
    this.gradeLvl = gradeLvl;
    this.grades = grades;
  }
  
  public String status(){
    return "Student name : " + name + "\nGrade Level : " + gradeLvl ;
  }

  public double getAverage(){
    double average = 0;
    for (int i = 0; i < grades.length;i ++){
      average += grades[i];
    }
    this.average = average;
    return average/grades.length;
  }

  public String passOrFail() {
    if (this.average > 65){
      return "Pass";
    }
    else{
      return "Fail";
    }    
  }
}
