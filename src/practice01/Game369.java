package practice01;

public class Game369 {
	public static void main(String[] args) {
		
		int n10, n1;
		
		for(int i = 1; i < 100 ; i++){	//1~99���� 369������ �Ѵ�
			n10 = i / 10;	//10�� �ڸ��� ��
			n1 = i % 10;	//1�� �ڸ��� ��	
			
			if(n1 == 3 || n1 == 6 || n1 ==9 ){	//1�� �ڸ� ���� 3,6,9�̸�	
				
				System.out.print(i+" "+"¦");
				
				if(n10 == 3 || n10 == 6 || n10 == 9){	//1�� �ڸ� ���� 3,6,9�鼭 10�� �ڸ����� 3,6,9�̸�
					System.out.print("¦");
				}
				System.out.println("");
			}else if(n10 == 3 || n10 == 6 || n10 == 9){	//1�� �ڸ� ���� 3,6,9�� �ƴϸ鼭 10�� �ڸ����� 3,6,9�̸�
				System.out.println(i+" "+"¦");
			}
			
			
		}
	}
}
