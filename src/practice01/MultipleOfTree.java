package practice01;

import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		

		System.out.print("���� �Է��Ͻʽÿ� : ");
		int num = scanner.nextInt();
		
		if( num % 3 == 0 ){
			System.out.println("3�� ��� �Դϴ�.");
		}else{
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		scanner.close();
	}
}
