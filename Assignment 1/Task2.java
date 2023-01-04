/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author isratjisa
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int sum = 0;
        
        while(num > 0){
            sum += num%10;
            num = num / 10;
        }
        
        System.out.println(sum);
    }
    
}
