package 다형성.과제3.문제1;

public class Coffee extends Beverage{
  public static int amount = 0;

  public Coffee(String name){
    super(name);
    calcPrice(name);
  }

  void calcPrice(String name){
    if(name.equals("Americano"))
      this.price = 1500;
    else if(name.equals("CafeLatte"))
      this.price = 2500;
    else
      this.price = 3000;
  }
}
