/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3;

import java.util.Scanner;

/**
 *
 * @author isratjisa
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int n = scn.nextInt();
        
        System.out.println("Enter the number to search : ");
        int num = scn.nextInt();
        
        int[] arr = new int[n];
        int counter = 0;
        
        System.out.println("Please Enter " + n + "numbers : ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            if(arr[i] == num) counter++;
        }
        
        System.out.println("Result: " + counter);
    }
    
}
