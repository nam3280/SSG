package 다형성.과제1;

public abstract class Wheeler {
 protected int velocity;
 protected String carName;
 protected int wheelNumber;
 
 abstract public void speedUp(int speed);
 
 abstract public void speedDown(int speed);
 
 public void stop(){
	 velocity = 0;
	 System.out.println("정지상태로 속도를 " + velocity + "으로 초기화합니다.");
 }
}

