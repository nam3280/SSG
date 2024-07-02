package 상속.문제1;

public class Alcohol extends Drink{
  private double alcper;

  Alcohol(String name, int price, int count, double alcper){
    super(name,price,count);
    this.alcper = alcper;
  }

  public static void printTitle(){
    System.out.println("상품명(도수[%])" + "\t" + "단가" + "\t" + "수량" + "\t" + "금액");
  }

  public void printData(){
    System.out.printf("%s(%.1f)\t%d\t%d\t%d",getName(),getAlcper(),getPrice(),getCount(),getTotalPrice());
  }

  public double getAlcper() {
    return alcper;
  }

  public void setAlcper(int alcper) {
    this.alcper = alcper;
  }
}
