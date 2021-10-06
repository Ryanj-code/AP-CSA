import java.util.*;
// Imports java classes.

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("Input a number for lower limit : ");
    int low = userInput.nextInt(); 
    System.out.print("Input a number for upper limit : ");
    int high = userInput.nextInt();
    System.out.println("Lower Limit : " + low + "\nUpper Limit : " + high);
    // Asks for lower and upper limit , then prints out the lower and upper limit.
    userInput.close();
    // Closes user input to stop resource leak.

    int factor = 0;
    boolean prime = false;
    boolean perfectsq = false;
    // Initializes the values.
    for (int i = low; i <= high; i++){
      for (int t = 1; t <= i; t++){
        if (i % t == 0){
          factor += 1;
        }
      } // For loop to check if the number for factors.

      if (factor == 2){
        prime = true;
      }
      if (factor % 2 == 1){
        perfectsq = true;
      } // Conditions for the number to check if it is a prime and perfect square.

      System.out.println();
      System.out.println("Number : " + i + "\n\nFactors : " + factor + "\nPrime : " + prime + "\nPerfect Square : " + perfectsq);
      // Print statement to show how many factors and if prime and/or a perfect square.
      
      factor = 0;
      prime = false;
      perfectsq = false; 
      // Sets the varible's value back to zero or false(original values).
    }
  }
}  
