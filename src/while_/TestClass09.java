package while_;

import java.util.Scanner;

public class TestClass09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name1, name2;
		
		System.out.print("이름1 입력 >> ");
		name1 = sc.next();
		System.out.print("이름2 입력 >> ");
		name2 = sc.next();
		
		System.out.println("n1 == n2 : "+(name1==name2));
		System.out.println("n1.equals(n2) : "+(name1.equals(name2)));
		
		//if(name1 == name2) {
		if(name1.equals(name2)) {
			System.out.println("이름이 같다");
		} else {
			System.out.println("이름이 다르다.");
		}
	}
}