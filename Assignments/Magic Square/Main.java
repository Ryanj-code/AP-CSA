class Main {
  public static void main(String[] args) {
    int[][] mSquare = { { 8, 13, 3, 10 }, { 11, 2, 16, 5 }, { 14, 7, 9, 4 }, { 1, 12, 6, 15 } };
    // Set 2D Array to a value
    boolean result = magicSquare(mSquare);
    System.out.println("Magic Square is " + result);
    // prints the result to see if the 2D array was magic square
  }

  public static boolean magicSquare(int[][] a) {
    int sum = 0;
    int len = a[0].length;
    // initialize the variable sum and len
    for (int j = 0; j < a[0].length; j++) {
      sum += a[0][j];
    } // gets sum of the first row and sets it to sum
    for (int i = 1; i < a.length; i++) {
      if (a[i].length != len) {
        return false;
      } // makes sure the row and length are equal
      int rowSum = 0; // initialize variable rowSum
      for (int j = 0; j < a[i].length; j++) {
        rowSum += a[i][j];
      } // gets the sum of the next row
      if (rowSum != sum) {
        return false;
      } // compares the rowSum and sum
    }

    for (int j = 0; j < a.length; j++) {
      int colSum = 0;
      // initialize variable colSum
      for (int i = 0; i < a.length; i++) {
        colSum += a[i][j];
      } // gets the sum of a column
      if (colSum != sum) {
        return false;
      } // compares colSum to sum
    }

    int dia = 0;
    // initialize variable dia
    for (int i = 0; i < a.length; i++) {
      dia += a[i][i];
    } // gets the value of the diagonal
    if (dia != sum) {
      return false;
    } // compares dia to sum
    dia = 0;
    for (int i = 0; i < a.length; i++) {
      dia += a[a.length - i - 1][i];
    } // gets sum of the other diagonal
    return dia == sum;
  }// return true if dia equal sum
}
