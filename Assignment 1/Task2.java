package task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		int sum = 0;
		int num = val.nextInt();
		
		while(num > 0) {
			int res = num % 10;
			sum = sum + res;
			num = num / 10;
		}
		
		System.out.println(sum);
	}
}
