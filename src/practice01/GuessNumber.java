package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner scanner = new Scanner( System.in );
		
		while(true){
			int k = r.nextInt(100) + 1; // 1~100���� ���� �� �����Ͽ� ���� k�� ����
			
			int count = 1;
			
			int min = 1;
			int max = 100;
			
			
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
			
			while(true){
				System.out.println(min+"-"+max);
				System.out.print(count+">>");
			
				int num = scanner.nextInt();
				
				//�Է� ���� �ִ�,�ּҰ� ���� ���϶� �ִ�,�ּ� ���� �ٲ��� �ʱ� ���� �ڵ�
//				if(num > max){
//					System.out.println("�� ����");
//				}else if(num <min){
//					System.out.println("�� ����");
//				}else 
					
				if( num < k ){
					System.out.println("�� ����");
					min = num;
				}else if( num > k ){
					System.out.println("�� ����");
					max = num;
				}else if( num == k ){
					System.out.println("�¾ҽ��ϴ�.");
					break;
				}
				count++;
			}
			
			String answer;
			
			while(true){
				System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
				answer = scanner.next();
			
				if(answer.equals("n") || answer.equals("y") ){
					break;
				}
			}
			if(answer.equals("n")){
				break;
			}
			
		}
		
		scanner.close();
	}
}
