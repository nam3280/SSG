package Jungol.Itaration1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while(true) {
      int base = Integer.parseInt(br.readLine());
      int height = Integer.parseInt(br.readLine());

      double triangleWidth = (double)(base * height) / 2;

      System.out.printf("Base = %d\n",base);
      System.out.printf("Height = %d\n",height);
      System.out.printf("Triangle width = %.1f\n",triangleWidth);
      System.out.print("Continue? ");

      char ch = br.readLine().charAt(0);

      if(ch == 'Y' || ch == 'y'){
        continue;
      }
      else{
        break;
      }
    }
  }
}
