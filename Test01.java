package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test01 {
   public static void main(String[] args) {
      boolean isNum = true;
      Scanner sc = new Scanner(System.in);
      System.out.print("���� 1�Է� >> ");
      int num1 = sc.nextInt();
      System.out.print("���� 2�Է� >> ");
      int num2 = sc.nextInt();
//      int num3 = num1;
//      int i = 0;
//      int j = 0;
      int max = 0;
      int min = 0;
      int i = 2;
      for (; i <= num1 && i <= num2;) {
         if (num1 % i == 0 && num2 % i == 0)
            min = i;
         i++;

      }
      max = num1 * num2 / min; // �ּ� ����� ���ϴ� ��
      System.out.println("�ּ� ����� : " + max);
      System.out.println("�ִ� ����� : " + min);

   }
}