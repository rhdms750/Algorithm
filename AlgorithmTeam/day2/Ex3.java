package day2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String yn = "y";
		do {
			int money = 0;
			
			System.out.print("주사위 결과 : ");
			int dice1 = scanner.nextInt();
			int dice2 = scanner.nextInt();
			int dice3 = scanner.nextInt();
			
			//주석을 넣어서 세가지가 같을 때 등 넣어야.
			if(dice1==dice2 && dice2==dice3) {
				money = 10000 + dice1*1000;
			}else if(dice1==dice2 || dice1==dice3) {
				money = 1000 + dice1*100;
			}else if(dice2==dice3) {
				money = 1000 + dice2*100;
			}else {
				int max = dice1;
				if(dice2 > max) {
					max = dice2;
				}else if(dice3 > max) {
					max = dice3;
				}
				money = max*100;
			}//if-else(OUTER)
			
			System.out.println(money);
			System.out.print("더 하실 건가요? : ");
			yn = scanner.next();
			
		}while(yn.equalsIgnoreCase("y"));
	}
}
