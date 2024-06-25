package SSG4th_Javaclass_과제.Quiz3;

public class Account {
  private String accNo;
  private int balance;

  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public int getBalance() {
    return balance;
  }

  public void save(int money){
    System.out.printf("%s 계좌에 %s만원이 입금되었습니다.\n",accNo, money);
    balance += money;
  }

  public void deposit(int money){
    System.out.printf("%s 계좌에 %s만원이 출금되었습니다.\n",accNo, money);
    balance -= money;
  }
}
