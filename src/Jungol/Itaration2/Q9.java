package Jungol.Itaration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q9{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());

    for(int i = 1; i <= num; i++){
      for(int j = 1; j <= num; j++){
        System.out.printf("(%d, %d) ",i,j);
      }
      System.out.println();
    }
  }
}