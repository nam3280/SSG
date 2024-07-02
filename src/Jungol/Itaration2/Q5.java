package Jungol.Itaration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q5{
  public static void main(String[] args) throws IOException{
    int odd = 0;
    int even = 0;

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

    while(st.hasMoreTokens()) {
      int num =Integer.parseInt(st.nextToken());

      if(num % 2 == 0 && num != 0){
        even++;
      }else if(num % 2 != 0){
        odd++;
      }else{
        break;
      }

    }
    System.out.printf("even : %d\n", even);
    System.out.printf("odd : %d", odd);
  }
}