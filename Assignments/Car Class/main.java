import java.util.*;

class Main {
  public static void main(String[] args) {
    car c = new car("Lamborghini Aventador S", 2019, 20, 24);
    
    c.turnOn();
    System.out.println(c.toString());
    c.drive(15);    
    System.out.println(c.toString());
  }
}
