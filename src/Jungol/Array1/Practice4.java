package Jungol.Array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice4 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] arr = new int[100];

    int i = 0;
    int count = 0;
    while(st.hasMoreTokens()){
      int num = Integer.parseInt(st.nextToken());

      if(num == 0)
        break;

      arr[i] = num;

      i++;
      count++;
    }

    for (int j = count - 1; j >= 0; j--) {
      System.out.printf("%d ", arr[j]);
    }
  }
}