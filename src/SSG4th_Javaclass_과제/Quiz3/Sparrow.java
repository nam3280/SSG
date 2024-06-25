package SSG4th_Javaclass_과제.Quiz3;

public class Sparrow {
  String name;
  int legs;
  int length;

  public void fly(){
    System.out.println("참새" + "(" + name + ")가 날아다닙니다.");
  }

  public void sing(){
    System.out.println("참새" + "(" + name + ")가 소리내어 웁니다.");
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString(){
    String str = "참새의 이름은 " + name + " 입니다.";

    return str;
  }
}
