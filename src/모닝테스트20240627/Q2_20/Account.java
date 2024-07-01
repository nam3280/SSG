package 모닝테스트20240627.Q2_20;

public class Account {
  private String number;
  private String name;
  private int money;
  static final int MIN = 0;
  static final int MAX = 1000000;

  Account(String number, String name, int money){
    this.number = number;
    this.name = name;
    this.money = money;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money, int num) {
    switch (num){
      case 1:
        if (money > MAX || money < MIN) {
          System.out.println("한도 초과");
          this.money = -1;
          break;
        }
        this.money = money;
        break;
      case 3:
        if (this.money + money > MAX) {
          System.out.println("한도 초과");
          break;
        }
        this.money += money;
        break;
      case 4:
        if (this.money - money < MIN) {
          System.out.println("잔액 부족");
          break;
        }
        this.money -= money;
        break;
    }
  }

  @Override
  public String toString() {
    return "Account{" +
        "number='" + number + '\'' +
        ", name='" + name + '\'' +
        ", money=" + money +
        '}';
  }
}
