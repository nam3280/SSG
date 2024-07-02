package Jungol.Itaration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    char ch = (char)(br.read());

    for (int i = 0; i < 20; i++) {
      System.out.print(ch);
    }
  }
}

