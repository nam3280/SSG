package Review;

public class Quiz9 {
  public static void main(String[] args) {
    int num = 12345;
    int sum = 0;

    int value = 0;

    value = num / 10000;
    sum += value;
    num -= value * 10000;

    value = num / 1000;
    sum += value;
    num -= value * 1000;

    value = num / 100;
    sum += value;
    num -= value * 100;

    value = num / 10;
    sum += value;
    num -= value * 10;

    value = num;
    sum += value;

    System.out.println("sum = " + sum);
  }
}

