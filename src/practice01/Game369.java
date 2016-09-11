package practice01;

public class Game369 {
	public static void main(String[] args) {
		
		int n10, n1;
		
		for(int i = 1; i < 100 ; i++){	//1~99까지 369게임을 한다
			n10 = i / 10;	//10의 자리의 수
			n1 = i % 10;	//1의 자리의 수	
			
			if(n1 == 3 || n1 == 6 || n1 ==9 ){	//1의 자리 수가 3,6,9이면	
				
				System.out.print(i+" "+"짝");
				
				if(n10 == 3 || n10 == 6 || n10 == 9){	//1의 자리 수가 3,6,9면서 10의 자리수가 3,6,9이면
					System.out.print("짝");
				}
				System.out.println("");
			}else if(n10 == 3 || n10 == 6 || n10 == 9){	//1의 자리 수가 3,6,9가 아니면서 10의 자리수가 3,6,9이면
				System.out.println(i+" "+"짝");
			}
			
			
		}
	}
}
