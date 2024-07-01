package 다형성.과제3.문제1;

public abstract class Beverage {
  private String name;
  protected int price;

  public Beverage(String name){
    this.name = name;
  }

  abstract void calcPrice(String name);

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
