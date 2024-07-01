package 다형성.과제1;

public class Prob1 {
  public static void main(String[] args) {
    Wheeler wheeler1 = new Truck("트럭",100, 4);
    System.out.println(wheeler1.carName + "의 현재 속도는 " + wheeler1.velocity + "입니다.");
    System.out.println(wheeler1.carName + " : " + "바퀴 " + wheeler1.wheelNumber + "개입니다.");
    Wheeler wheeler2 = new Bike("자전거",25, 2);
    System.out.println(wheeler2.carName + "의 현재 속도는 " + wheeler2.velocity + "입니다.");
    System.out.println(wheeler2.carName + " : " + "바퀴 " + wheeler2.wheelNumber + "개입니다.");

    wheeler1.speedDown(100);
    wheeler2.speedDown(100);

    System.out.println(wheeler1.carName + "의 현재 속도는 " + wheeler1.velocity + "입니다.");
    System.out.println(wheeler2.carName + "의 현재 속도는 " + wheeler2.velocity + "입니다.");

    wheeler1.stop();
    wheeler2.stop();

    System.out.println(wheeler1.carName + "의 현재 속도는 " + wheeler1.velocity + "입니다.");
    System.out.println(wheeler2.carName + "의 현재 속도는 " + wheeler2.velocity + "입니다.");
  }
}
