package Array.Array3;

import java.util.Random;

public class Prob2 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    int[] grArr = new int[10];

    Prob2 prob2 = new Prob2();

    int[] randomArr = new int[10];

    randomArr = prob2.generateRandom(arr);
    System.out.println("===========================");
    prob2.getMaxNum(randomArr);
  }

  public int[] generateRandom(int[] arr){
    Random random = new Random();

    System.out.println("<< 생성된 난수 >>");
    for (int i = 0; i < arr.length; i++) {
      int randomNum = random.nextInt(30) + 1;
      arr[i] = randomNum;
      System.out.printf("%d, ",arr[i]);
    }
    System.out.println();
    return arr;
  }

  public void getMaxNum(int[] arr){
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if(i == 0)
        max = arr[i];
      else if(max < arr[i])
        max = arr[i];
    }
    System.out.printf("배열에서 가장 큰 숫자 : %d",max);
  }
}
