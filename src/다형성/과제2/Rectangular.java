package 다형성.과제2;

public class Rectangular extends Shape{
  private double width;
  private double height;

  public Rectangular(){}
  public Rectangular(String name, double width, double height){
    super(name);
    this.width = width;
    this.height = height;
  }

  @Override
  void calculationArea() {
    this.area = getWidth() * getHeight();
    System.out.printf("%s의 면적은 %.1f",getName() ,this.area);
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
