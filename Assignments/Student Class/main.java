import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] grades = {90, 80, 85, 88, 75, 94};
    student person = new student("Jeff", 10, grades);

    System.out.println(person.status());
    System.out.println(person.getAverage());
    System.out.println(person.passOrFail());
  }
}
