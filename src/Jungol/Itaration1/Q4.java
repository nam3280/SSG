package Jungol.Itaration1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q4{
  public static void main(String[] args) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

    int count = 0;

    while(st.hasMoreTokens()) {
      int num =Integer.parseInt(st.nextToken());

      if(num == 0)
        break;

      if(num % 3 != 0 && num % 5 != 0)
        count++;
    }
    System.out.println(count);
  }
}
