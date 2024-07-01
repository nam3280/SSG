package Review;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz10 {
  public static boolean isNumber(String input){
    return Pattern.matches("^[0-9] + $", input);
  }

  public static void main(String[] args){
    int answer = (int)(Math.random() * 100) + 1;

    String input = "";
    int count = 0;

    Scanner s = new Scanner(System.in);

    System.out.print("1과 100사이의 값을 입력하세요 : ");

    do {
      input = s.next();

      if(isNumber(input) || Integer.parseInt(input) > 100 || Integer.parseInt(input) < 1) {
        System.out.println("다시 입력");
      }
      else {
        count++;

        if (Integer.parseInt(input) > answer)
          System.out.println("더 큰 수를 입력하세요.");
        else if (Integer.parseInt(input) < answer)
          System.out.println("더 작은 수를 입력하세요.");
        else {
          System.out.println("맞혔습니다.");
          System.out.printf("시도 횟수는 %d번입니다.", count);
          break;
        }
      }
    }while (true);
  }
}
