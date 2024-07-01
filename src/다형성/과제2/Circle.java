package 다형성.과제2;

public class Circle extends Shape{
  private double radius;

  public Circle(){}
  public Circle(String name, double radius){
    super(name);
    this.radius = radius;
  }

  @Override
  void calculationArea() {
    this.area = getRadius() * getRadius() * Math.PI;
    System.out.println(getName() + "의 면적은 " + this.area);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}
