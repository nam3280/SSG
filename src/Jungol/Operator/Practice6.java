package Jungol.Operator;

import java.util.Scanner;

public class Practice6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean c = (a > b);
        System.out.printf("%d > %d --- %s\n",a,b,c);

        c = (a < b);
        System.out.printf("%d < %d --- %s\n",a,b,c);

        c = (a >= b);
        System.out.printf("%d >= %d --- %s\n",a,b,c);

        c = (a <= b);
        System.out.printf("%d <= %d --- %s",a,b,c);
    }
}

