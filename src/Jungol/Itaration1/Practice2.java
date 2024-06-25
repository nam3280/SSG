package Jungol.Itaration1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(bf.readLine());

        int a = 1;

        int sum = 0;

        while(a <= i){
            sum += a;
            a++;
        }

        System.out.println(sum);
    }
}
