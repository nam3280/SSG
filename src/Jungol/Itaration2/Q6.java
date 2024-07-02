package Jungol.Itaration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int max = 0;
    int min = 0;
    int sum = 0;
    double avg = 0;
    int num = 0;
    boolean b = true;
    while(b) {
      StringTokenizer st = new StringTokenizer(br.readLine() ," ");

      int count = st.countTokens();

      if(count != 2){
        System.out.println("다시 입력");
        continue;
      }

      for(int i = 0; i < count; i++){
        int token = Integer.parseInt(st.nextToken());

        if(i == 0)
          max = token;
        else{
          if(max > token){
            min = token;
          }
          else{
            min = max;
            max = token;
          }
        }
      }

      for(int i = min; i <= max; i++){
        if(i % 5 == 0 || i % 3 == 0){
          sum += i;
          num++;
        }

        if(i == max)
          b = false;
      }
    }


    avg = (double)sum / num;

    System.out.printf("sum : %d\n",sum);
    System.out.printf("avg : %.1f\n",avg);
  }
}
