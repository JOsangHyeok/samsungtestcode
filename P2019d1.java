package stest;

import java.util.Scanner;

public class P2019d1 {	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt(); // number input
			System.out.print("1 ");
			for(int i=1;i<=num;i++) { //loop
				int a= (int)(Math.pow(2, i));
				System.out.print(a+ " ");
			}
			sc.close();
		}
	}