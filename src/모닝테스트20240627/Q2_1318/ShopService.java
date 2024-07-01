package 모닝테스트20240627.Q2_1318;

public class ShopService {
  // 싱글톤 클래스 객체를 담을 인스턴스 변수
  private static ShopService singleton;
  //생성자 private(외부에서 new 사용 X)
  private ShopService() {
  }

  public static ShopService getInstance() {

    return singleton;
  }
}
//싱글톤패턴
//특정 클래스의 인스턴스를 1개만 생성되는 것을 보장하는 디자인 패턴

//장점
//1초에 10번 같은 요청을 보내면 같은 객체를 1초에 10번 생성하고 소멸되는 메모리 낭비 문제가 발생하지만
//싱글톤은 new로 객체를 생성하고 그 객체를 이후에도 사용하도록 공유(static)하여 메모리 낭비 문제 방지

//단점
//클래스 사이에 의존성이 높아지게 된다.
//인스턴스가 변경 되면 해당 인스턴스를 참조하는 모든 클래스들을 수정해야 한다.
//다형성을 적용하지 못한다.(상속이 어렵다)
//독립적인 테스트가 힘들다.