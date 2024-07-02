package Jungol.Itaration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q10{
  public static void main(String[] args) throws IOException{
    int i1 = 0;
    int i2 = 0;

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

    int count = st.countTokens();

    for(int i = 0; i < count; i++){
      int token = Integer.parseInt(st.nextToken());

      if(i == 0)
        i1 = token;
      else
        i2 = token;
    }

    if(i1 > i2){
      for(int i = 1; i <= 9; i++){
        for(int j = i1; j >= i2; j--){
          if(i * j >= 10)
            System.out.printf("%d * %d = %d   ",j ,i ,i * j);
          else
            System.out.printf("%d * %d =  %d   ",j ,i ,i * j);
        }
        System.out.println();
      }
    }

    else{
      for(int i = 1; i <= 9; i++){
        for(int j = i1; j <= i2; j++){
          if(i * j >= 10)
            System.out.printf("%d * %d = %d   ",j ,i ,i * j);
          else
            System.out.printf("%d * %d =  %d   ",j ,i ,i * j);
        }
        System.out.println();
      }
    }
  }
}