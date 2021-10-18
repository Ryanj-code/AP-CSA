import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 100};
    int[] array2 = {2, 2, 6};
    int[] array3 = {2, 3, 8};
    int sum67 = sum67(array);
    boolean firstLast6 = firstLast6(array2);
    System.out.println("FL 6 : " + firstLast6);
    // firstLast6
    System.out.println("Sum 67 : " + sum67);
    // sum67
    int[] middleWay = middleWay(array2, array3);
    String middleWayPrint = Arrays.toString(middleWay);
    System.out.println("Middle Way : " + middleWayPrint);
    // middleWay
    int centeredAverage = centeredAverage(array);
    System.out.println(centeredAverage);
    // centeredAverage
    int countClumps = countClumps(array2);
    System.out.println("Clumps : " + countClumps);
    // countClumps
  }

  public static boolean firstLast6(int[] array) {
    if (array[0] == 6 || array[array.length - 1] == 6) {//if the first or last number is equal to 7 we return true otherwise return false
      return true;
    } else {
      return false;
    }
  }

  public static int sum67(int[] array) {
    int sum = 0;
    boolean value = false;//initialize the variables
    for (int i = 0; i <= array.length - 1; i++) {//loop as long as i is not equal to the array length - 1
      if (array[i] == 6) {//if the number is equal to 6 , set the value to true;
        value = true;
      }
      if (array[i] == 7) {//if the number is equal to 7 , set the value to false
        value = false;
      }
      if (value == false) {//if the value is false then we do the next condition
        if (array[i] != 6 && array[i] != 7) {//if the number is not equal to 6 and 7 we add the number to sum
          sum = sum + array[i];
        }
      }
    }
    return sum;
  }

  public static int[] middleWay(int[] array, int[] array2) {
    int[] result = new int[2];//make new array
    int middle1 = array[1];
    int middle2 = array2[1];//set up 2 variables equal to the middle of the array gotten from the parameter
    result[0] = middle1;
    result[1] = middle2;//put the 2 numbers from the variable into the array created
    return result;
  }

  public static int centeredAverage(int[] array) {
    int total = 0;
    int small = array[0];
    int big = array[0];
    int count = 0;//initialize the variables
    for (int i = 0; i <= array.length - 1; i++) {
      if (array[i] < small) {
        small = array[i];//if the number is smaller than the smallest then set to small
      } else if (array[i] > big) {
        big = array[i];//if the number is bigger than the biggest then set to big 
      } else {
        total = total + array[i];//otherwise add to the total and add 1 to count
        count++;
      }
    }
    total = total / (count);//then do total divide by the count
    return total;
  }

  public static int countClumps(int[] array) {
    int clumps = 0;
    int count = 0;
    int check = 0;//initialize variables
    while (clumps < array.length - 1){//while clump is not bigger than the size of array
      for(int i = clumps; i != array.length - 1 && array[i] == array[i + 1];i++){//set i to clumps, and then we check if i is not equal to the size of the array and also check if the index[i] of the array is equal to the next number in the array
        check += 1;
        clumps += 1;//if true check and clumps + 1
      }
      if (check > 0){//if check is greater than 0 count and clumps + 1, check = 0
        count += 1;
        check = 0;
        clumps += 1;
      }
      else{//else check = 0 and clumps + 1
        check = 0;
        clumps += 1;
      }
    }
    return clumps;
  }
}
