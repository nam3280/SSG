package Jungol.Itaration1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Practice4 {
    public static void main(String[] args) throws IOException{
        int sum = 0;
        float avg = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int count = st.countTokens();

        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
        }

        avg = (float)sum / count;

        System.out.println(sum);
        System.out.println(Math.round(avg * 10) / 10.0);
    }
}
