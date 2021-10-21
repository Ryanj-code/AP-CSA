public class Main {
  public static void main(String[] args) {
    First();
    Second();
    Third();
  } // Calls the methods. 

  public static void First(){
    for(int k = 1;k <= 3; k++){  //Loops 3 times for the 3 rows.
      for(int i = 0;i <= 9; i++){  //Loops 10 times for the amounts of numbers that need to be printed.
        for(int j = 1;j <= 3; j++){    
          System.out.print(i);  
        }          
      }
     System.out.println();
    }
  }

  public static void Second(){  
    for(int l = 1;l <= 5; l++){   //Loops 3 times for the 3 rows.
      for(int o = 9;o >= 0; o--){   //Loops 10 times for the amounts of numbers that need to be printed.
        for(int p = 1;p <= 5; p++){  //Loops 5 times to print each number 5 times.
          System.out.print(o); 
        }
      }
     System.out.println();
    }
  }

  public static void Third(){
    for(int p = 1;p <= 4; p++){ //Loops 4 times to print out each row .
      for(int m = 9;m >= 1; m--){ //Loops 9 times for the 9 numbers that are needed.
        for(int n = m;n >= 1;n--){ //Loops to print out the number the number's time (Ex: Printing the number 9 nine times).
          System.out.print(m); 
        }   
      }
    System.out.println(); 
    } 
  }

}
