package Jungol.Itaration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice5 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int Multiples_of_3 = 0;
    int Multiples_of_5 = 0;

    boolean b = true;
    while(b) {
      int count = 0;

      StringTokenizer st = new StringTokenizer(br.readLine() ," ");

      count = st.countTokens();

      if(count != 10){
        System.out.println("다시 입력");
        continue;
      }

      for(int i = 0; i < count; i++){
        int token = Integer.parseInt(st.nextToken());

        if(token % 3 == 0)
          Multiples_of_3++;
        if(token % 5 == 0)
          Multiples_of_5++;

        if(i == count - 1)
          b = false;
      }
    }
    System.out.println("Multiples of 3 : " + Multiples_of_3);
    System.out.println("Multiples of 5 : " + Multiples_of_5);
  }
}
