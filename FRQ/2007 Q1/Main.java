import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a starting value: ");
    int start = input.nextInt();
    System.out.print("\nEnter a divisor value: ");
    int divisor = input.nextInt();
    System.out.print(Arrays.toString(firstNumSelfDivisors(start,divisor)) + "\n");    
  }

  public static boolean isSelfDivisor(int number) {
    int newNum = number;
    while (newNum > 0) {
      int digit = newNum % 10;
      if (digit == 0 || newNum % digit != 0) {
        return false;
      }
      newNum /= 10;
    }
    return true;
  }

  public static int[] firstNumSelfDivisors(int start, int num) {
    int[] divisors = new int[num];
    int value = 0;
    int nextNum = start;
    while (value < num) {
      if(isSelfDivisor(nextNum)) {
        divisors[value] = nextNum;
        value ++;        
      }
      nextNum ++;
    }
    return divisors;
  }
}
