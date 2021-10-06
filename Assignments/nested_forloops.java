class Main {
  public static void main(String[] args) {
    Problem1();
    Problem2();
  }
  
  public static void Problem1(){
    int num = 5;   
    for(int i = 1; i <= 9; i+=2){
      Dash(num);
      for(int o = 1; o <= i; o++){
        System.out.print(i);
      }
      Dash(num);
      num--;
      System.out.println();  
    }
  } // Prints dashes, and the value of i, then slowly decreases # of dashes while increasing value of i and the number of times i is printed.
   
  public static void Dash(int num){
    for(int j = 1; j <= num; j++){
      System.out.print("-");
    }
  } // Prints dashes.
  
  public static void Problem2(){
    int x = 0;
    int y = 22;
    for(int a = 0; a < 6; a++){
      back(x);
      Excla(y);   
      forward(x);
      System.out.println();
      x+=4;
      y-=4;
    } 
  } // Prints exclamation marks y # of times, and slowly decreases the exclamation marks while increasing the number of forward and backward slashes.
   
  public static void forward(int x){
    for(int z = 0; z < x/2; z++){
      System.out.print("/");
    }
  } // Prints forward slashes.
  
  public static void back(int y){
    for(int v = 0; v < y/2; v++){
      System.out.print("\\");
    }
  } // Prints backwards slashes.
  
  public static void Excla(int y){
    for(int c = 0; c < y;c++){
      System.out.print("!");
    }
  } // Prints exclamation marks.
}
