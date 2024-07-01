package 모닝테스트20240627.Q1_9;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int student = 0;
    int[] scores = new int[100];

    Scanner sc = new Scanner(System.in);

    System.out.println("------------------------------------------------------");
    System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
    System.out.println("------------------------------------------------------");

    boolean bool = true;
    while(bool){
      System.out.print("선택> ");
      int select = sc.nextInt();

      switch (select){
        case 1 :
          System.out.print("학생수 입력> ");
          student = sc.nextInt();
          break;
        case 2 :
          if(student == 0)
            System.out.println("학생수를 입력하러 가세요");
          else {
            for (int i = 0; i < student; i++) {
              System.out.printf("%d번째 학생의 점수 입력> ", i + 1);
              scores[i] = sc.nextInt();
            }
          }
          break;
        case 3 :
          if(student == 0)
            System.out.println("학생수와 점수를 입력하러 가세요");
          else if (scores.length != student) {
            System.out.println("학생들의 점수를 입력하러 가세요");
          } else {
            for (int i = 0; i < student; i++) {
              System.out.printf("scores[%d] : %d\n", i, scores[i]);
            }
          }
          break;
        case 4 :
          int max = scores[0];
          int sum = 0;
          double avg = 0;

          if(student == 0)
            System.out.println("입력된 학생이 없습니다.");
          else if (scores.length != student)
            System.out.println("학생들의 점수를 입력하러 가세요");
          else{
            for (int i = 0; i < scores.length; i++) {
              sum += scores[i];

              if (max < scores[i])
                max = scores[i];
            }
            avg = (double) sum / student;

            System.out.println("최고 점수 : " + max);
            System.out.printf("평균 점수 : %.1f\n", avg);
          }
          break;
        case 5 :
          System.out.println("프로그램 종료");
          bool = false;
          break;
      }
    }
  }
}
