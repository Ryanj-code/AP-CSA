import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Area Calculator!");
    System.out.println("Enter 1 to find the area of a Square");
    System.out.println("Enter 2 to find the area of a Rectangle");
    System.out.println("Enter 3 to find the area of a Triangle");
    System.out.println("Enter 4 to find the area of a Circle");
    System.out.println("Enter 5 to find the area of a Parallelogram");
    System.out.println("Enter 6 to find the area of a Trapezoid");
    System.out.print("Input : ");
    
    Scanner userInput = new Scanner(System.in);
    int answer = userInput.nextInt();
    // Gets user input.
    
    // If, else if, and else statements based on what the user inputs.
    if (answer == 1){
        System.out.println("Please input the side");
        double side = userInput.nextDouble();
        area(side);
    } else if (answer == 2) {
        System.out.println("Please input the width");
        double width = userInput.nextDouble();
        System.out.println("Please input the length");
        double length = userInput.nextDouble();
        area(width,length);
    } else if (answer == 3) {
        System.out.println("Please input the base");
        double base = userInput.nextDouble();
        System.out.println("Please input the height");
        double height = userInput.nextDouble();
        area2(base,height); 
    } else if (answer == 4) {
        System.out.println("Please input the radius");
        double radius = userInput.nextDouble();
        area2(radius); 
    } else if (answer == 5) {
        System.out.println("Please input the base");
        double base = userInput.nextDouble();
        System.out.println("Please input the height");
        double height = userInput.nextDouble();
        area(base,height);
    } else if (answer == 6) {
        System.out.println("Please input the first base");
        double base1 = userInput.nextDouble();
        System.out.println("Please input the second base");
        double base2 = userInput.nextDouble();
        System.out.println("Please input the height");
        double height = userInput.nextDouble();
        area(base1,base2,height);
    } else {
        System.out.print("?");
    }
  }
  
  // Functions for the different shapes available.

  public static void area(double num){
    System.out.print("Area is : " + num * num);
  }

  public static void area(double num1,double num2){
    System.out.print("Area is : " + num1 * num2);
  }

  public static void area(double num1,double num2,double num3){
    System.out.print("Area is : " + ((num1 + num2) * 0.5) * num3);
  }

  public static void area2(double num){
    System.out.print("Area is : " + Math.PI * (num * num));
  }

  public static void area2(double num1,double num2){
    System.out.print("Area is : " + num1 * num2 * 0.5);
  }

}
