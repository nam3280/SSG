package Jungol.Itaration2;

public class Practice8 {
  public static void main(String[] args){
    for(int i = 1; i <= 3; i++){
      for(int j = 1; j <= 5; j++)
        if((i + 1) * j >= 10)
          System.out.printf("%d * %d = %d   ", i + 1, j, (i + 1) * j);
        else
          System.out.printf("%d * %d =  %d   ", i + 1, j, (i + 1) * j);
      System.out.println();
    }
  }
}
