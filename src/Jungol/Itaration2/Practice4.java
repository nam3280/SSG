package Jungol.Itaration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int sum = 0;
    boolean b = true;
    while(b) {
      int num = Integer.parseInt(br.readLine());

      if (num > 100) {
        System.out.println("다시 입력");
        continue;
      }

      for (int i = num; i <= 100; i++) {
        sum += i;

        if(i == num)
          b = false;
      }
    }
    System.out.print(sum);
  }
}
