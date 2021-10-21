class Main {
  public static void main(String[] args) {
    Student bob  = new Student(70.0, 165, 18, "bob", "male", "green", 65.0, "1. Computer Science", 1);

    Athlete steve = new Athlete(77.0, 200, 24, "steve", "male","blue", "basketball", "forward");

    System.out.println(bob.getAverage());
    System.out.println(steve.getSport());
  }
}
