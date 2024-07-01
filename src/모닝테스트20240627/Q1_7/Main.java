package 모닝테스트20240627.Q1_7;

public class Main {
  public static void main(String[] args) {
    int[] array = {1,5,3,8,2};

    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if(max < array[i])
        max = array[i];
    }
    System.out.println(max);
  }
}
