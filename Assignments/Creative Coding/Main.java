import java.util.*;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int result = 0;
    int count = 0;
    boolean repeat = true;
        
    while (repeat == true){
    result = r.nextInt(101);        
    
    for (int i = 0;i <= result;i++){      
      if (i != 0){
        if (result%i == 0){
          count++;
        }
      }
    }
    System.out.println(result + " has " + count + " factors");
    
    count = 0;           
    
    Scanner input = new Scanner(System.in);
    System.out.println("Repeat program?(y/n)"); 
    String check = input.nextLine();
    System.out.println("====================");     

    if (check.equals("y")){
      repeat = true;
      }
    else if (check.equals("y")){
      repeat = false;
      }
    else if (!check.equals("y")||!check.equals("n")){
      System.out.println("Your input is invalid");
      repeat = false;
      } 
    }  
  }
}
