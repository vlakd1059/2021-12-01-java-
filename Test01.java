package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=1;
		System.out.print("n �Է�: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			System.out.print(sum+" ");
			sum+=i;
		}
				

	}

}
