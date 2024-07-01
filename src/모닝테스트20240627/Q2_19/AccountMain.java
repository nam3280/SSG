package 모닝테스트20240627.Q2_19;

public class AccountMain {
  public static void main(String[] args) {
    Account account = new Account();

    account.setBalance(10000);
    System.out.println("현재 잔고: " + account.getBalance());

    account.setBalance(-100);
    System.out.println("현재 잔고: " + account.getBalance());

    account.setBalance(2000000);
    System.out.println("현재 잔고: " + account.getBalance());

    account.setBalance(300000);
    System.out.println("현재 잔고: " + account.getBalance());
  }
}
