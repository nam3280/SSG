package 다형성.과제3.문제1;

public class CoffeeShop {
  public static void main(String[] args) {
    System.out.println("****java nara CoffeeShop영업개시****");
    Beverage[] beverage = new Beverage[5];
    beverage[0] = new Coffee("Cappuccino");
    beverage[1] = new Coffee("CafeLatte");
    beverage[2] = new Tea("ginsengTea");
    beverage[3] = new Coffee("CafeLatte");
    beverage[4] = new Tea("redginsengTea");
    getSalesInfo(beverage);

    System.out.println("총 판매 금액==>" + getTotalPrice(beverage));
    System.out.println("Coffee의 판매 개수=>" + Coffee.amount + "잔");
    System.out.println("Tea의 판매 개수=>" + Tea.amount + "잔");
  }

  public static void getSalesInfo(Beverage[] beverage){
    for (int i = 0; i < beverage.length; i++) {
      if(beverage[i] instanceof Coffee)
        Coffee.amount++;
      else
        Tea.amount++;
      System.out.println((i + 1) + "번째 판매 음료는 " + beverage[i].getName() + "이며, 가격은 " + beverage[i].price);
    }
  }

  public static int getTotalPrice(Beverage[] beverages){
    int total = 0;

    for (int i = 0; i < beverages.length; i++)
      total += beverages[i].price;

    return total;
  }
}
