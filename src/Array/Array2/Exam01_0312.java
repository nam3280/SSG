package Array.Array2;

public class Exam01_0312 {
  public static void main(String[] args) {
    int[] arr = new int[]{10,30,20,80,50};
    double[] resultArr = new double[5];


    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      total += arr[i];
      resultArr[i] = arr[i];
    }

    for (int i = 0; i < resultArr.length; i++) {
      int num = 0;
      resultArr[i] = (resultArr[i] / total) * 100;
      num = (int)resultArr[i];
      for(int j = 0; j < num; j++){
        System.out.print("*");
      }
      System.out.printf("(%f)\n",resultArr[i]);
    }
  }
}
//비율 : (하나의 정수 / 정수들의 총합) * 100