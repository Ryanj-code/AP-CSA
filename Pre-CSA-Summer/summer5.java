class Main {
  public static void main(String[] args) {
    digitRange(9257302);
  } // Calling function to test.

  public static int digitRange(int num) {
    int digitRange, digit, maxNum = 0;
    int minNum = 9;
    // Initialize variables.

    while (num > 0) {
      digit = num % 10;
      // Using mod to move the decimal to the left once and single out the last digit
      // to set digit equal to it.
      if (maxNum < digit) {
        maxNum = digit;
      } // Checks if the digit is greater than maxNum and set maxNum to digit if it is.

      if (minNum > digit) {
        minNum = digit;
      } // Checks if the digit is less than minNum and set maxNum to digit if it is.

      num = num / 10;
    } // Using divide to move the decimal to the left once to set num to get every
      // number, but the last one.

    digitRange = (maxNum - minNum + 1);
    return digitRange;
    // Sets digit range to max digit - min digit + 1 and returns it.

  }
}
