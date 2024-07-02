package Jungol.Itaration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = 0;
    int sum = 0;
    double avg = 0;

    boolean b = true;
    while(b) {
      num = Integer.parseInt(br.readLine());

      if(num > 100){
        System.out.println("다시 입력");
        continue;
      }

      boolean bb = true;
      while(bb){
        StringTokenizer st = new StringTokenizer(br.readLine() ," ");

        int count = st.countTokens();

        if(count != num){
          System.out.println("다시 입력");
          continue;
        }

        for(int i = 0; i < count; i++){
          sum += Integer.parseInt(st.nextToken());

          if(i == count -1) {bb = false;}
        }
      }

      if(bb == false) {b = false;}
    }

    avg = (double)sum / num;

    System.out.printf("%.2f\n",avg);
  }
}
