import java.util.*;
import java.io.*;
   
class Main {
  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(new File("satData.txt"));

    int[] SAT = new int[71];
    int i = 0;

    while (scanner.hasNextInt()) {
      SAT[i++] = scanner.nextInt();
    }

    System.out.println(Arrays.toString(SAT));
    int average = getAverage(SAT);
    System.out.println("Average : " + average);

    int mode = getMode(SAT);
    System.out.println("Mode : " + mode);

    /*
    int median = getMedian(SAT);
    System.out.println("Median : " + median);
    */
  }

  /**
   * this method will determine the mean (average) of the data set.
   * 
   * @param scores for the SAT exam
   * @return the average score from the array
   */
  static int getAverage(int[] scores) {
    int average = 0;
    for (int i = 0; i < scores.length;i++){
      average += scores[i];
    }
    average /= scores.length;
    // Loops through the array, sums all numbers and divide by length of array.  
    return average;
  } // Return average;
                                        
  /**
   * this method will determine the mode (most frequent value) of the data set.
   * 
   * @param scores for the SAT exam
   * @return the mode score from the array
   */
  static int getMode(int[] scores) {
    int result = 0;
    int num = 0;
    for (int i = 0; i < scores.length - 1;i++){
      if (scores[i] > num){
        num = scores[i];
      }
    }
    // Checks if score[i] > num, set num to score[i] if true. 

    int[] frequent = new int [num];
    num = 0;
    // New array and set num to 0.

    for (int i = 0; i < scores.length;i++){
      num = scores[i];
      frequent[num - 1] ++;      
    }
    // Check scores[i] and increase its frequency in the array each time it appears.

    for (int i = 0; i < frequent.length;i++){
      if (frequent[i] > result){
        result = frequent[i];
        num = i;
      }
    }
    // Checks the most frequent score.

    result = num + 1;
    return result;
  } // Return result.
  
  /*
  static int getMedian(int[] scores) {
    int result = 0;
    int num = 0;
    for (int i = 0; i < scores.length - 1;i++){
      if (scores[i] > num){
        num = scores[i];
      }
    }
    int[] frequent = new int [num];
    num = 0;
    for (int i = 0; i < scores.length;i++){
      num = scores[i];
      frequent[num - 1] ++;      
    }
    num = scores.length/2;
    return result;
  }
  */
}
