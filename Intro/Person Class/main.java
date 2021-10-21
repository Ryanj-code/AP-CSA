class Main {
  public static void main(String[] args) {
    student bob  = new student(70.0, 165, 18, "bob", "male", "green", 65.0, "1. Computer Science", 1);

    athlete steve = new athlete(77.0, 200, 24, "steve", "male","blue", "basketball", "forward");

    System.out.println(bob.getAverage());
    System.out.println(steve.getSport());
  }
}
