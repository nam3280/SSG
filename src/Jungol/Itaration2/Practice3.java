package Jungol.Itaration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());

    for(int i = 1; i <= num; i++){
      if(i % 2 == 0)
        System.out.printf("%d ",i);
    }
  }
}
