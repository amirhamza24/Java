package task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) 
    {
        int count = 0, i;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int num = s.nextInt();
        
        int arr[] = new int[num];
        
        System.out.println("Enter the elements: ");
        for(i = 0; i < num; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int search = s.nextInt();
        
        for(i = 0; i < num; i++)
        {
            if(arr[i] == search)
            {
                count++;
            }
        }
        System.out.println(search+" " + "-"+" "+count);
    }
    
}
