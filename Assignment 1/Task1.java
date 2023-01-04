package task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int n = scn.nextInt();
        
        int i = 0;
        int[] arr = new int[100];
        
        while(num > 0){
            int x = num%10;
            arr[i] = x;
            num = num/10;
            i++;
        }
        
        System.out.println(arr[n]);
    }
    
}
