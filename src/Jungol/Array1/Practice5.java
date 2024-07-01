package Jungol.Array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice5 {
  public static void main(String[] args) throws IOException {
    double[] arr = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int count = st.countTokens();

    int num1 = 0;
    int num2 = 0;

    for (int i = 0; i < count; i++) {
      if(i == 0) {
        num1 = Integer.parseInt(st.nextToken());
      } else {
        num2 = Integer.parseInt(st.nextToken());
      }
    }

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if(i == num1 || i == num2)
        sum += arr[i];
    }

    System.out.printf("%.1f",sum);
  }
}