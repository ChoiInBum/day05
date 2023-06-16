package quiz;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		//정수를 입력하여 팩토리얼의 정수를 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		int num, fc=1;
		
		while(true) {
			System.out.print("정수 입력 >> ");
			num = sc.nextInt();
			
			for(int i=1; i<=num; i++) {
				fc *= i;
			}
			
			System.out.println(num+"! - "+fc);
			fc = 1;
		}
	}
}