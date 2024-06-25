package Jungol.Itaration1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q3{
  public static void main(String[] args) throws IOException{
    int sum = 0;
    int even = 0;

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

    int count = 0;

    while(st.hasMoreTokens()) {
      int num =Integer.parseInt(st.nextToken());

      if(num > 100 || num < 0)
        break;

      sum += num;

      count++;
    }

    System.out.printf("sum : %d\n", sum);
    System.out.printf("avg : %.1f", (double)sum / count);
  }
}