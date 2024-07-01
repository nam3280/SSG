package 다형성.과제2;

public abstract class Shape {
  private String name;
  protected double area;

  public Shape(){}
  public Shape(String name){this.name = name;}

  abstract void calculationArea();

  public void print(){}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
