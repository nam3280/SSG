package Jungol.Array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    char[] arr = new char[10];

    int i = 0;
    while(st.hasMoreTokens()){
      arr[i] = st.nextToken().charAt(0);
      i++;
    }

    for (int j = 0; j < arr.length; j++) {
      if(j == 0 || j == 3 || j == 6){
        System.out.printf("%s ", arr[j]);
      }
    }
  }
}
