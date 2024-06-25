package Jungol.Itaration1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice3{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.print("number? ");

            int num = Integer.parseInt(bf.readLine());

            if(num > 0){
                System.out.println("positive integer");
            }else if (num < 0){
                System.out.println("negative number");
            }else{
                break;
            }
        }
    }
}

