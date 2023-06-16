package quiz;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		/*
			1. 10 이상 정수를 입력하여 각 자리의 정수 합을 구하시오

			Ex)
			정수 입력 >> 123
			합 : 6
			정수 입력 >> 540
			합 : 9
			정수 입력 >> 9
			10 이상 정수를 입력하세요.
			정수 입력 >> 5623
			합 : 16
		*/
		Scanner sc = new Scanner(System.in);
		
		int num, sum;
		
		while(true) {
			System.out.print("정수 입력 >> ");
			num = sc.nextInt(); // 333
			
			sum = 0;
			
			if(num>=10) {			
				while(true) {
					sum = sum + (num%10); // 3+3+3
					num = num / 10; // 33 3
					
					if(num==0) {
						System.out.println("합 : "+sum);
						break;
					}
				}
			} else if(num<10 && num>0) {
				System.out.println("두 자릿수 정수를 입력하세요.");
			} else if(num<=0) {
				System.out.println("양의 정수를 입력하세요.");
			}
		}
	}
}