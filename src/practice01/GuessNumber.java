package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner scanner = new Scanner( System.in );
		
		while(true){
			int k = r.nextInt(100) + 1; // 1~100까지 랜덤 수 생성하여 변수 k에 대입
			
			int count = 1;
			
			int min = 1;
			int max = 100;
			
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			
			while(true){
				System.out.println(min+"-"+max);
				System.out.print(count+">>");
			
				int num = scanner.nextInt();
				
				//입력 값이 최대,최소값 범위 밖일때 최대,최소 값을 바꾸지 않기 위한 코드
//				if(num > max){
//					System.out.println("더 낮게");
//				}else if(num <min){
//					System.out.println("더 높게");
//				}else 
					
				if( num < k ){
					System.out.println("더 높게");
					min = num;
				}else if( num > k ){
					System.out.println("더 낮게");
					max = num;
				}else if( num == k ){
					System.out.println("맞았습니다.");
					break;
				}
				count++;
			}
			
			String answer;
			
			while(true){
				System.out.print("다시하시겠습니까(y/n)>>");
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
