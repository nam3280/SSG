package Jungol.Array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice1 {
  public static void main(String[] args)throws IOException {
    char[] arr = new char[10];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int i = 0;
    while(st.hasMoreTokens()){
      char ch = st.nextToken().charAt(0);
      arr[i] = ch;
      System.out.print(ch);
      i++;
    }
  }
}