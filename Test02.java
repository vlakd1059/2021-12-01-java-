package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int row = sc.nextInt();
		for (int i = row; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
