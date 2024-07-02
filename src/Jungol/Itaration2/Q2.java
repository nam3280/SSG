package Jungol.Itaration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int max = 0;
    int min = 0;

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

        if(i == 0){
          max = token;
        }
        else{
          if(max < token){
            min = max;
            max = token;
          }
          else
            min = token;

          b = false;
        }
      }
    }

    for(int i = min; i <= max; i++)
      System.out.printf("%d ",i);
  }
}
