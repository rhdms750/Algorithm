package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int w = 0, h = 0, n = 0, l = 0, d = 0, x = 0, y = 0;
		String yn = "y";
		
		do {
			System.out.print("�������� ����, ���� : ");
			w = scanner.nextInt();
			h = scanner.nextInt();
			
			int[][] pan = new int[w][h];
			
			System.out.print("������ ���� : ");
			n = scanner.nextInt();
			
			for(int i = 0; i < n; i++) {
				System.out.print("������ ����, ����, ��ǥx, ��ǥy : ");
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
						System.out.println("������ �߸� �������ϴ�.");
						i--;
						break;
					}
				}
			}//for(OUTER)
			
			//���
			for(int i = 0; i < pan.length; i++)
				System.out.println(Arrays.toString(pan[i]));
			
			System.out.print("��� �Ͻ� �ǰ���?(yn) : ");
			yn = scanner.next();

		}while(yn.equalsIgnoreCase("y"));
		
		scanner.close();
	}
}
