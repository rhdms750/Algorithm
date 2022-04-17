package day2;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("세 개의 숫자를 입력해 주세요 : ");
		int[] arr = new int[3];
		arr[0] = scanner.nextInt();
		arr[1] = scanner.nextInt();
		arr[2] = scanner.nextInt();
		
		//Selection Sort 
		int tmp;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println(arr[1]);
		
		scanner.close();
	}
}
