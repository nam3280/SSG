package Jungol.Itaration1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice6
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");

            int num = Integer.parseInt(bf.readLine());

            System.out.println("number?");

            switch (num)
            {
                case 1:
                    System.out.println("Seoul");
                    break;
                case 2:
                    System.out.println("Washington");
                    break;
                case 3:
                    System.out.println("Tokyo");
                    break;
                case 4:
                    System.out.println("Beijing");
                    break;
                default:
                    System.out.println("none");
                    break;
            }

            if(num > 4 || num < 1)
                break;
        }
    }
}
