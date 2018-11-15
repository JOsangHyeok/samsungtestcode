package stest;

import java.util.Scanner;
public class P1545d1 {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); //system input

			long num1 = sc.nextLong(); //number receive
			for (long i = num1; i >= 0; i--) { //loop
				System.out.print(i+ " ");
			}
			sc.close();
		}
	}
