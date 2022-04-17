package _01_����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

//���� ��ũ : https://www.acmicpc.net/problem/10816

public class Ex1_10816_����ī��2 {

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		
		//����� ������ ī�� ����(1~500000)
		int N = Integer.parseInt(reader.readLine());
		
		//����� ������ ����ī�带 ���� �ؽ���
		TreeMap<Integer,Integer> sangMap = new TreeMap<Integer,Integer>();
		
		//�Է¹��� ����� ������ ����ī�� ���ڿ�
		token = new StringTokenizer(reader.readLine());
		
		//�Է¹��� ���ڸ� �ؽ��ʿ� ����
		while (token.hasMoreTokens()) {
			int input = Integer.parseInt(token.nextToken());
			//�̹� �ʿ� �� ���� ���� ��
			if (sangMap.containsKey(input)) {
				int value = sangMap.get(input) + 1;
				sangMap.put(input, value);

			//�ʿ� �� ���� ���� �� ���� ���� ��
			}else {
				sangMap.put(input, 1);
			}
		}
		
		//ã������ ���� ����
		int M = Integer.parseInt(reader.readLine());
		
		//ã������ ����
		int searchNum;
		
		//�Է�â �׹�° ��
		token = new StringTokenizer(reader.readLine());
		
		//�Է¹��� ���� �迭
		int[] givenArr = new int[M];
		
		int k = 0;
		while(token.hasMoreTokens()) {
			int input = Integer.parseInt(token.nextToken());
			givenArr[k] = input;
			k++;
		}
		
		//�Էµ� ���� searchNum�� ����Ž������ ��ٸʿ��� ��ȸ
		for (int i = 0; i < M; i++) {
			searchNum = givenArr[i];
			if (sangMap.containsKey(searchNum)) {
				System.out.print(sangMap.get(searchNum)+" ");
			}else {
				System.out.print(0 + " ");
			}
		}

	}//end main

}
