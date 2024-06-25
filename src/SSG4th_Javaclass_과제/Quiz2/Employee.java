package SSG4th_Javaclass_과제.Quiz2;

public class Employee {
  private String name;
  private int age;
  private String dept;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public void print(){
    System.out.printf("이 름 : %s\t나 이 : %d\t부 서 : %s\n",name,age,dept);
  }
}
