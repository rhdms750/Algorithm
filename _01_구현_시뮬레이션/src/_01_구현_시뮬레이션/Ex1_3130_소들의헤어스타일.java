package _01_구현_시뮬레이션;

//https://codeup.kr/index.php

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex1_3130_소들의헤어스타일 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//소의 수
		int N = Integer.parseInt(reader.readLine());
		
		//각 소들의 키 입력할 리스트
		long[] hiList = new long[N];
		
		//소의 키 하나씩 입력
		String input;
		int k = 0;
		while ((input = reader.readLine())!=null) {
			long hi = Integer.parseInt(input);
			hiList[k] = hi;
			k++;
		}
		
		//소들이 헤어스타일을 확인할 수 있는 소들의 수
		long count = 0;
		for (int i = 0; i < hiList.length-1; i++) {
			for (int j = i+1; j < hiList.length; j++) {
				if (hiList[i] <= hiList[j]) {
					break;
				}else {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
	
}
