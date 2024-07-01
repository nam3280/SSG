package 모닝테스트20240627.Q2_20;

import java.util.Scanner;

public class BankApplication {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int count = 0;

    Account[] account = new Account[100];
    Account makeAccount = new Account("","",0);
    BankApplication bankApplication = new BankApplication();

    boolean bool = true;
    while(bool) {
      System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
      System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
      System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
      System.out.print("선택>");
      int num = Integer.parseInt(sc.nextLine());
      switch (num){
        case 1:
          System.out.println("ㅡㅡㅡㅡ");
          System.out.println("계좌생성");
          System.out.println("ㅡㅡㅡㅡ");
          System.out.print("계좌번호: ");
          makeAccount.setNumber(sc.nextLine());
          System.out.print("계좌주: ");
          makeAccount.setName(sc.nextLine());
          System.out.print("초기 입금액: ");
          makeAccount.setMoney(Integer.parseInt(sc.nextLine()),num);
          if(makeAccount.getMoney() == -1) {
            System.out.println("계좌 생성 실패");
            break;
          }
          account[count] = makeAccount;
          System.out.println("계좌가 생성되었습니다.");
          count++;
          break;
        case 2:
          System.out.println("ㅡㅡㅡㅡ");
          System.out.println("계좌목록");
          System.out.println("ㅡㅡㅡㅡ");
          for (int i = 0; i < count; i++)
            System.out.println(account[i].toString());
          break;
        case 3:
          System.out.println("ㅡㅡㅡㅡ");
          System.out.println("예금");
          System.out.println("ㅡㅡㅡㅡ");
          System.out.print("계좌번호 : ");
          bankApplication.InOutMoney(sc.nextLine(),account, count, num);
          break;
        case 4:
          System.out.println("ㅡㅡㅡㅡ");
          System.out.println("출금");
          System.out.println("ㅡㅡㅡㅡ");
          System.out.print("계좌번호 : ");
          bankApplication.InOutMoney(sc.nextLine(),account, count, num);
          break;
        case 5:
          System.out.println("프로그램 종료");
          bool = false;
          break;
      }
    }
  }

  public void InOutMoney(String number, Account[] account, int count, int num){
    for (int i = 0; i < count; i++) {
      if(number.equals(account[i].getNumber())) {
        if(num == 3)
          System.out.print("예금액 입력 : ");
        else
          System.out.print("출금액 입력 : ");
        account[i].setMoney(Integer.parseInt(sc.nextLine()),num);
        break;
      }
    }
  }
}
