package Review;

public class Quiz3 {
  public static void main(String[] args) {
    int sum = 0;

    for(int i = 0; i <= 9; i++){
      for(int j = 1; j <= 10 - i; j++){
        sum += j;
      }
    }

    System.out.println("sum = " + sum);
  }
}