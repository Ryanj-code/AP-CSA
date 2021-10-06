class Main {
  public static void main(String[] args) {
    /*
    int totalChange = 35; //You must declare the variable's type when declaring a new variable
    System.out.println(totalChange);
    
    
    System.out.println(35/25); //integer divided by integer results in an integer which truncates the decimal.
    
    while(totalChange > 0)
    {
      if(totalChange >= 25)
      {
        Q+= 1;
        totalChange -= 25;//totalChange = totalChange - 25
      }
      else if(totalChange >= 10)
      {
        D+= 1;
        totalChange -= 10;
      }
      else if(totalChange >= 5)
      {
        N+= 1;
        totalChange -= 5;
      }
      else if(totalChange >= 1)
      {
        P+= 1;
        totalChange -= 1;
      }
      System.out.println("Num Quarter : " + Q);
      System.out.println("Num Dime: " + D);
      System.out.println("Num Nickel : " + N);
      System.out.println("Num Penny : " + P);
      */

      int cents = 109;

      cents = change(25, cents, " quarters ");
      cents = change(10, cents, " dimes ");
      cents = change(5, cents, " nickels ");
      cents = change(1, cents, " pennies ");
    }
  
    public static int change(int v, int c, String label){ 
      System.out.println(c / v + label);
      return c % v;
    } // Takes in the value of the coin, how much cents, and the coin, then prints maximum # of that coin while returning the leftover.
}
