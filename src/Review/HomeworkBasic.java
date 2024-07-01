package Review;

import java.util.Scanner;

public class HomeworkBasic {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HomeworkBasic hb = new HomeworkBasic();

    boolean b = true;
    while (b) {
      System.out.print("1 ~ 17번 문제 번호 입력 : ");
      int num = sc.nextInt();

      if (num < 0 || num > 17) {
        System.out.println("1 ~ 17 사이의 번호 입력하세요;;");
        continue;
      }
      else {
        switch (num) {
          case 0 -> {b = hb.End(b);}
          case 1 -> {hb.Method1();}
          case 2 -> {hb.Method2();}
          case 3 -> {hb.Method3();}
          case 4 -> {hb.Method4();}
          case 5 -> {hb.Method5();}
          case 6 -> {hb.Method6();}
          case 7 -> {hb.Method7();}
          case 8 -> {hb.Method8();}
          case 9 -> {hb.Method9();}
          case 10 -> {hb.Method10();}
          case 11 -> {hb.Method11();}
          case 12 -> {hb.Method12();}
          case 13 -> {hb.Method13();}
          case 14 -> {hb.Method14();}
          case 15 -> {hb.Method15();}
          case 16 -> {hb.Method16();}
          case 17 -> {hb.Method17();}
          default -> {break;}
        }
      }
    }
  }
  public boolean End ( boolean b){
    System.out.println("프로그램을 종료합니다.");

    b = false;
    return b;
  }

  public void Method1() {
    System.out.println("자바 소스파일의 확장자 : .java");
    System.out.println("컴파일된 파일의 확장자 : .class");
  }

  public void Method2() {
    System.out.println("파일 이름 : Shape.java");
    System.out.println("출력 결과 : Shape");
  }

  public void Method3() {
    System.out.println("sum = (sum > 100) ? 100 : 0;");
  }

  public void Method4() {
    System.out.println("(1), (2), (3), (4)");
  }

  public void Method5() {
    System.out.println("(1) int height;");
    System.out.println("(2) double size = 0.25;");
    System.out.println("(3) double total = height + size;");
    System.out.println("(4) char c = 'a';");
    System.out.println("(5) String name = \"NamYunHo\";");
  }

  public void Method6() {
    System.out.println("public class SampleProgram{");
    System.out.println("\t" + "public static void main(String[] args){");
    System.out.println("\t" + "\t" + "int k = 10;");
    System.out.println("\t" + "\t" + "int j = 20;");
    System.out.println("\t" + "\t" + "int result = k + j;");
    System.out.println("\t" + "\t" + "System.out.println(result);");
    System.out.println("\t" + "\t" + "}");
    System.out.println("\t" + "}");
  }

  public void Method7() {
    System.out.println("SampleProgram");
  }

  public void Method8() {
    System.out.println("java");
  }

  public void Method9() {
    System.out.println("javac");
  }

  public void Method10() {
    System.out.println("(1) x");
    System.out.println("(2) x");
    System.out.println("(3) x");
    System.out.println("(4) o");
  }

  public void Method11() {
    System.out.println("Scanner");
  }

  public void Method12() {
    System.out.println("extends");
  }

  public void Method13() {
    System.out.println("(1), (2)");
  }

  public void Method14() {
    System.out.println("double");
  }

  public void Method15() {
    System.out.println("int add (int a, int b, int c){");
    System.out.println("\t" + "int result = a + b + c;");
    System.out.println("\t" + "return result;");
    System.out.println("}");
  }

  public void Method16() {
    System.out.println("1 3 5 7 9");
  }

  public void Method17() {
    System.out.println("(1) sum += 1;");
    System.out.println("(2) 120");
  }
}