package Jungol.Operator;

import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d %d\n",++a ,b);
        b--;
        System.out.printf("%d %d",a ,b);
    }
}
