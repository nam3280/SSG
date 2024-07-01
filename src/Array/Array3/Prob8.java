package Array.Array3;

public class Prob8 {
  public static void main(String[] args) {
    int[][] arr = new int[5][5];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        arr[i][j] = (arr.length * (i + 1)) - j;
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
