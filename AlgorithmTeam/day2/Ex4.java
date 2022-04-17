package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int w = 0, h = 0, n = 0, l = 0, d = 0, x = 0, y = 0;
		String yn = "y";
		
		do {
			System.out.print("격자판의 가로, 세로 : ");
			w = scanner.nextInt();
			h = scanner.nextInt();
			
			int[][] pan = new int[w][h];
			
			System.out.print("막대의 갯수 : ");
			n = scanner.nextInt();
			
			for(int i = 0; i < n; i++) {
				System.out.print("막대의 길이, 방향, 좌표x, 좌표y : ");
				l = scanner.nextInt();
				d = scanner.nextInt();
				x = scanner.nextInt();
				y = scanner.nextInt();
				
				for(int j = 0; j < l; j++) {
					if(d==0) {
						pan[x-1][y-1] = 1;
						y++;
					}else if(d==1){
						pan[x-1][y-1] = 1;
						x++;
					}else {
						System.out.println("방향을 잘못 적었습니다.");
						i--;
						break;
					}
				}
			}//for(OUTER)
			
			//출력
			for(int i = 0; i < pan.length; i++)
				System.out.println(Arrays.toString(pan[i]));
			
			System.out.print("계속 하실 건가요?(yn) : ");
			yn = scanner.next();

		}while(yn.equalsIgnoreCase("y"));
		
		scanner.close();
	}
}
