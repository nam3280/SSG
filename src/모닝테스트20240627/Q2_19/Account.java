package 모닝테스트20240627.Q2_19;

public class Account {
  private int balance;
  static final int MIN_BALANCE = 0;
  static final int MAX_BALANCE = 1000000;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    if(balance < MIN_BALANCE || balance > MAX_BALANCE)
      return ;

    this.balance = balance;
  }
}
