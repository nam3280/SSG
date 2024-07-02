package 상속.문제1;

public class Drink {
  private String name;
  private int price;
  private int count;

  Drink(String name, int price, int count){
    this.name = name;
    this.price = price;
    this.count = count;
  }

  public int getTotalPrice(){
    int total = this.price * this.count;
    return total;
  }

  public static void printTitle(){
    System.out.println("상품명" + "\t" + "단가" + "\t" + "수량" + "\t" + "금액");
  }

  public void printData(){
    System.out.println(getName() + "\t" + getPrice() + "\t" + getCount() + "\t" + getTotalPrice());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
