package 모닝테스트20240627.Q2_1318;

public class Main {
  public static void main(String[] args) {
//    Member user1 = new Member("홍길동","hong");
//    MemberService memberService = new MemberService();
//    boolean result = memberService.logIn("hong","12345");
//    if (result)
//      System.out.println("로그인 되었습니다.");
//    else
//      System.out.println("id 또는 password가 올바르지 않습니다.");
//    Printer.println(10);
//    Printer.println(true);
//    Printer.println(5.7);
//    Printer.println("홍길동");
    ShopService obj1 = ShopService.getInstance();
    ShopService obj2 = ShopService.getInstance();

    if (obj1 == obj2)
      System.out.println("같은 ShopService 객체입니다.");
    else
      System.out.println("다른 ShopService 객체입니다.");
  }
}
