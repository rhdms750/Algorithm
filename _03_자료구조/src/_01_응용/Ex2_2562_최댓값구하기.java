package _01_����;

import java.io.*;
import java.util.*;

//���� ��ũ : https://www.acmicpc.net/problem/2562

public class Ex2_2562_�ִ񰪱��ϱ� {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		
		//�Է¹��� ���ڸ� ����Ʈ�� ����
		List<Integer> list = new ArrayList<Integer>(9);
		String input;
		
		while ((input = reader.readLine())!=null) {
			list.add(Integer.parseInt(input));
		}
		
		//�ִ� ���
		int max = Collections.max(list);
		System.out.println(max);
		
		//�ε��� ���
		int index = list.indexOf(max);
		System.out.println(index+1);
	
	}//end main
}
