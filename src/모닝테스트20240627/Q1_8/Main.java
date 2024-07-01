package 모닝테스트20240627.Q1_8;

public class Main {
  public static void main(String[] args) {
    int[][] array = {{95,86}, {83,92,96}, {78,83,93,87,88}};

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.printf("%d ", array[i][j]);
      }
      System.out.println();
    }
  }
}