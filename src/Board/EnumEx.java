package Board;

public enum EnumEx {
  AA("메인 메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit");

  private final String value;

  EnumEx(String value) {
    this.value = value;
  }

  public String value(){
    return value;
  }
}
