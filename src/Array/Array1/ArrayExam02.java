package Array.Array1;

import java.util.Random;

public class ArrayExam02 {
  public static void main(String[] args) {
    int[] arr = new int[5];

    Random random = new Random();

    int randomNum = 0;

    for (int i = 0; i < arr.length; i++) {
      randomNum = random.nextInt(100) + 1;
      arr[i] = randomNum;
      System.out.printf("%d ",arr[i]);
    }
  }
}
