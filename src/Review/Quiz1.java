package Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz1 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    Quiz1 quiz = new Quiz1();

    Boolean bool = true;

    while (bool) {
      System.out.print("몇 번 문제를 푸시겠습니까? : ");

      int num = Integer.parseInt(br.readLine());

      switch (num) {
        case 1 -> {
          quiz.Quiz1_1();
        }
        case 2 -> {
          quiz.Quiz1_2();
        }
        case 3 -> {
          quiz.Quiz1_3();
        }
        case 4 -> {
          quiz.Quiz1_4();
        }
        case 5 -> {
          quiz.Quiz1_5();
        }
        case 6 -> {
          quiz.Quiz1_6();
        }
        case 7 -> {
          quiz.Quiz1_7();
        }
        case 8 -> {
          quiz.Quiz1_8();
        }
        default -> {
          bool = quiz.end(bool);
        }
      }
    }
  }

  public void Quiz1_1() throws IOException {
    System.out.print("정수 입력 : ");

    int x = Integer.parseInt(br.readLine());

    boolean result = ((x > 10) && (x < 20));

    System.out.println(result);
  }

  public void Quiz1_2() throws IOException {
    System.out.print("문자 입력 : ");

    char ch = br.readLine().charAt(0);

    boolean result = ((ch != ' ') && (ch != '\t'));

    System.out.println(result);
  }

  public void Quiz1_3() throws IOException {
    System.out.print("문자 입력 : ");

    char ch = br.readLine().charAt(0);

    boolean result = ((ch != 'x') && (ch != 'X'));

    System.out.println(result);
  }

  public void Quiz1_4() throws IOException {
    System.out.print("문자 입력 : ");

    char ch = br.readLine().charAt(0);

    boolean result = ((ch >= 48) && (ch <= 57));

    System.out.println(result);
  }

  public void Quiz1_5() throws IOException {
    System.out.print("문자 입력 : ");

    char ch = br.readLine().charAt(0);

    boolean result = (((ch >= 65) && (ch <= 90)) || ((ch >= 97) && (ch <= 122)));

    System.out.println(result);
  }

  public void Quiz1_6() throws IOException {
    System.out.print("숫자 입력 : ");

    int year = Integer.parseInt(br.readLine());

    boolean result = false;

    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
      result = true;
    }
    System.out.println(result);
  }

  public void Quiz1_7() throws IOException {
    System.out.print("true, false 중 하나 입력 : ");

    String str = br.readLine();

    boolean powerOn = false;

    if (str.equals("true")) {
      powerOn = true;
    }
    System.out.println(powerOn);
  }

  public void Quiz1_8() throws IOException {
    System.out.print("문자열 입력(yes를 입력하면 true) : ");

    String str = br.readLine();

    boolean powerOn = false;

    if (str.equals("yes")) {
      powerOn = true;
    }
    System.out.println(powerOn);
  }

  public boolean end(boolean bool) {
    System.out.println("프로그램 종료");
    bool = false;
    return bool;
  }
}
