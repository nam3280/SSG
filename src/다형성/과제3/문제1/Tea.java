package 다형성.과제3.문제1;

public class Tea extends Beverage{
  public static int amount;

  public Tea(String name){
    super(name);
    calcPrice(name);
  }

  void calcPrice(String name){
    if(name.equals("ginsengTea"))
      this.price = 2000;
    else if(name.equals("redginsengTea"))
      this.price = 2500;
    else
      this.price = 1500;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount += amount;
  }
}
