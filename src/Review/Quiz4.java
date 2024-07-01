package Review;

public class Quiz4 {
  public static void main(String[] args) {
    int sum = 0;

    int i = 1;

    while(sum < 100){
      sum += i;

      if(i > 0) {i++;}
      else {i--;}

      i = -i;
    }

    System.out.println(sum);
  }
}
