package _01_����_�ùķ��̼�;

//https://codeup.kr/index.php

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex1_3130_�ҵ�����Ÿ�� {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//���� ��
		int N = Integer.parseInt(reader.readLine());
		
		//�� �ҵ��� Ű �Է��� ����Ʈ
		long[] hiList = new long[N];
		
		//���� Ű �ϳ��� �Է�
		String input;
		int k = 0;
		while ((input = reader.readLine())!=null) {
			long hi = Integer.parseInt(input);
			hiList[k] = hi;
			k++;
		}
		
		//�ҵ��� ��Ÿ���� Ȯ���� �� �ִ� �ҵ��� ��
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
