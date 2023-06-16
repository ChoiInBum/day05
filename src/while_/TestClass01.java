package while_;

public class TestClass01 {
	public static void main(String[] args) {
		/*
			while(조건식) {
				종속문장
			}
			다음문장
		*/
		int i=1, sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("sum : "+sum);
		System.out.println("다음문장 실행");
	}
}