class Main {
  public static void main(String[] args) {
    //count1000();
    //countEven();
    //countBackwards();
    //countOdd();
    //countAbbrev();
  }

  public static void count1000(){
    for (int i = 1; i <= 1000; i++){
      System.out.println(i);
    }
  } // Counts all # from 1 to 1000.

  public static void countEven(){
    for (int j = 2; j <= 1000; j+=2){
      System.out.println(j);
    }
  } // Counts all even # from 1 to 1000.

  public static void countBackwards(){
    for (int k = 1000; k >= 1; k--){
      System.out.println(k);     
    }  
  } // Counts all # from 1 to 1000 backwards.

  public static void countOdd(){
    for (int l = 1; l <= 1000; l+=2){
      System.out.println(l);
    }
  } // Counts all odd # from 1 to 1000.

  public static void countAbbrev(){
    int Abbrev = 0;   
    for (int a = 1; a <= 10; a++){
      for (int b = 1; b <= 10; b++){
        for (int c = 1; c <= 10; c++){
          Abbrev ++;
          System.out.println(Abbrev);
        }
      }   
    }
  } // Counts all # from 1 to 1000 using three loops.
  
}
