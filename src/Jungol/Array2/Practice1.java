package Jungol.Array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice1 {
  public static void main(String[] args)throws IOException {
    int[] arr = new int[26];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int num = st.countTokens();

    for (int i = 0; i < num - 1; i++) {
      char ch = st.nextToken().charAt(0);

      if((int)ch - 65 < 0 || (int)ch - 65 > 25)
        break;

      arr[(int)ch - 65]++;
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0)
        continue;
      else
        System.out.printf("%s : %d\n",(char)(i + 65), arr[i]);
    }
  }
}