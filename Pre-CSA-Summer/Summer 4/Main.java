import java.util.Scanner;
// Imports scanner.

class Main {
  public static void main(String[] args) {
    boolean run = true;
    while (run){
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Enter your palindrome : ");
      String palindrome = userInput.next();
      System.out.println(isPalindrome(palindrome));
      // A palindrome is a word that is spelled the same backwards.

      System.out.println();
      
      System.out.print("Enter your abecedarian : ");
      String abecedarian = userInput.next();
      System.out.println(isAbecedarian(abecedarian));
      // An abecedarian is a word arranged alphabetically.

      // Asking the user for a palindrome and an abecedarian, then inputing the string into the method returns if its true or false. 

      System.out.println();
      
      System.out.println("Again? {y/n}");
      String answer = userInput.next();
      answer  = answer.toLowerCase();
      
      if (answer.equals("y")){
        System.out.println();
      }
      else if (answer.equals("n")){
        userInput.close(); // Closes user.Input.
        break;
      } 
    } // Asks user if they want to check/continue with another word.
  }

  public static boolean isPalindrome(String palindrome){
    String word = palindrome;
    // Initalizing the variable.   
    boolean test;
    int constant = word.length();
    int t = word.length() - 1; 
    String checkWord = "";  
    
    for (int i = constant; i > 0; i--){
      checkWord += word.charAt(i-1);
      t -= 1; 
    } // To flip/reverse the string.
    // For loop for checking the whole word.
    if (word.equals(checkWord)){
      test = true;
    }
    else{
      test = false;
    }
    return test;
  } // Checks the word.

  public static boolean isAbecedarian(String abecedarian){
    String word = abecedarian;
    // Initializing the variable.
    boolean test = true;
    int constant = word.length() - 1 ; 
    // Need the -1 here so the for loop won't go out of bounds.
    for (int i = 0; i < constant; i++) {
      char x = word.charAt(i);
      char y = word.charAt(i + 1);
    // For loop to run through/check the whole word.
      if (x < y ){
        test = true;
      }
      else{
        test = false;
        break;
      }
    }
    return test;     
  } // Checks the word.

}
