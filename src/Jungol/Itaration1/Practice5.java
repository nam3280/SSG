package Jungol.Itaration1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice5{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int num = Integer.parseInt(bf.readLine());

            if(num % 3 == 0){
                int num2 = num / 3;
                System.out.println(num2);
            }else if((num / 3) != 0){
                continue;
            }else if(num == -1){
                break;
            }
        }
    }
}
