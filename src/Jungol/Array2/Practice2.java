package Jungol.Array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice2 {
  public static void main(String[] args)throws IOException {
    int[] arr = new int[100];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int num = st.countTokens();

    for (int i = 0; i < num; i++) {
      int number = Integer.parseInt(st.nextToken());

      if(number == 0)
        break;

      arr[i]++;
    }

    for (int i = 0; i < 26; i++) {
      if (arr[i] == 0)
        continue;
      else
        System.out.printf("%s : %d\n",(char)(i + 65), arr[i]);
    }
  }
}