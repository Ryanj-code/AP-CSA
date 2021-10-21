class Main {
  public static void main(String[] args) {
    int[][] brooklynTemp = {{47, 31}, {57, 38}, {47, 36}, {42, 34}, {46, 36}, {54, 43}, {50, 44}}; 
    
    System.out.println("Average Low : " + averageLow(brooklynTemp) + " Average High : " + averageHigh(brooklynTemp));
    System.out.println("Absolute Low : " + absoluteLow(brooklynTemp) + " Absolute High : " + absoluteHigh(brooklynTemp));
  }

  public static int averageHigh(int[][] arr){
    int avgH = 0;
    int count = 0;
    for(int i = 0;i < arr.length;i++){
      avgH += arr[i][0];   
      count ++;   
    }
    
    return avgH/count;
  }

  public static int averageLow(int[][] arr){
    int avgL = 0;
    int count = 0;
    for(int i = 0;i < arr.length;i++){
      avgL += arr[i][1];   
      count ++;   
    }

    return avgL/count;
  }

  public static int absoluteHigh(int[][] arr){
    int absH = 0;
    for(int i = 0;i < arr.length;i++){
      if(arr[i][0] > absH){
        absH = arr[i][0];
      }      
    }

    return absH;
  }

  public static int absoluteLow(int[][] arr){
    int absL = 0;
    for(int i = 0;i < arr.length;i++){  
      if(i == 0){
        absL = arr[i][1];
      }
      if(arr[i][1] < absL){
        absL = arr[i][1];
      }  
    }

    return absL;
  }

}
