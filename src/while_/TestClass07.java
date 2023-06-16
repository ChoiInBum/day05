package while_;

public class TestClass07 {
	public static void main(String[] args) {
		for(int k=0; k<3; k++) {
			System.out.println("=== 상위 반복문 시작");
			
			for(int i=0; i<3; i++) {
				System.out.println(i+".for");
			}
			
			System.out.println("상위 반복문 끝 ===");
		}
		
		System.out.println("===== while =====");	
		
		int m=0, n=0;
		
		while(m<3) {
			System.out.println("=== 상위 반복문 시작");
			n=0;
			
			while(n<3) {
				System.out.println(n+".while");
				n++;
			}
			
			System.out.println("상위 반복문 끝 ===");
			m++;
		}
	}
}