package 다형성.과제1;

public class Truck extends Wheeler{
  Truck(String carName, int velocity, int wheelNumber){
    super();
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
  }

  @Override
  public void speedUp(int speed) {
    this.velocity += speed * 5;

    if(this.velocity > 100) {
      this.velocity = 100;
      System.out.println(this.carName + "의 최고속도위반으로 속도를 " + this.velocity + "으로 내립니다.");
    }
    else
      System.out.println(this.carName + "의 속도를 " + this.velocity + "으로 올립니다.");
  }

  @Override
  public void speedDown(int speed) {
    this.velocity -= speed * 5;

    if(this.velocity < 50) {
      this.velocity = 50;
      System.out.println(this.carName + "의 최저속도위반으로 속도를 " + this.velocity + "으로 올립니다.");
    }
    else
      System.out.println(this.carName + "의 속도를 " + this.velocity + "으로 내립니다.");
  }
}
