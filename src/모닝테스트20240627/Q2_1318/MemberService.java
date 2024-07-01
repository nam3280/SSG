package 모닝테스트20240627.Q2_1318;

public class MemberService {
  public boolean logIn(String id, String password){
    if(id.equals("hong") && password.equals("12345"))
      return true;
    else
      return false;
  }

  public void logOut(String id){
    System.out.printf("%s님이 로그아웃 되었습니다.",id);
  }
}
