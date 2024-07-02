package Jungol.Itaration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q8{
  public static void main(String[] args) throws IOException{
    int x = 0;
    int y = 0;

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

    int count = st.countTokens();

    for(int i = 0; i < count; i++){
      int token = Integer.parseInt(st.nextToken());

      if(i == 0)
        x = token;
      else
        y = token;
    }

    for(int i = 1; i <= x; i++){
      for(int j = 1; j <= y; j++){
        System.out.printf("%d ",j * i);
      }
      System.out.println();
    }
  }
}