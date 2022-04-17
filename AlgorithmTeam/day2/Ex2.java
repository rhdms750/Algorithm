package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		
		//�Է� �� ���� : ArrayList�� ����
		ArrayList<Integer> lostList = new ArrayList<Integer>(50);
		System.out.println("�ֿ� ī���� ���ڸ� �Է��ϼ���.(���� �� -1 �Է�)");
		
		int i = 0;
		while(true) {
			int input = scanner.nextInt();
			if(input == -1) break;
			lostList.add(input);
		}
		lostList.trimToSize();
		System.out.println(lostList);
		
		//ArrayList -> Array
		int[] lostArr = new int[lostList.size()];
		for(int k = 0; k < lostList.size(); k++) {
			lostArr[k] = lostList.get(k);
		}
		
		//������������ ���� ���� 
		int tmp = 0;
		for(int k = 0; k < lostArr.length-1; k++) {
			for(int j = k+1; j < lostArr.length; j++) {
				if(lostArr[k]>lostArr[j]) {
					tmp = lostArr[k];
					lostArr[k] = lostArr[j];
					lostArr[j] = tmp;
				}
			}
		}//end for
		
		//���� ���� ������ +1
		int min = lostArr[0];
		int lost = 0;
		for(int k = 1; k < lostArr.length; k++) {
			min++;
			if(lostArr[k]<min) {
				lost = lostArr[0];
				break;
			}else if(lostArr[k]>min) {
				lost = lostArr[k]-1;
				break;
			}
		}
		
		System.out.println(lost);
	}//end main
}


	//2 3 4 5  min=2; 2+1 =3
	//1 2 3 4 5  lostArr[1]= 2
	
	//1 2 3 4 5  min=1; 1+1 =2
	//1   3 4 5  lostArr[1] =3
	
	