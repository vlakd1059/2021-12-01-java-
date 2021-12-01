package 자바테스트;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=1;
		System.out.print("n 입력: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			System.out.print(sum+" ");
			sum+=i;
		}
				

	}

}
