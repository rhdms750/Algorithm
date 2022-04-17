package _01_����;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//���� ��ũ : https://www.acmicpc.net/problem/10816

public class Ex1_BinarySearch {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		Scanner scan = new Scanner(System.in);
		
		//����� ������ ī�� ����(1~500000)
		int n = scan.nextInt();
		
		//����� ����ī�忡 �����ִ� ����(-10000000~10000000)
		int[] hasArr = new int[n];
		for (int i = 0; i < n; i++) {
			hasArr[i] = scan.nextInt();
		}
		
		//����� ���� ī�� sort
		Arrays.sort(hasArr);
		
		//�־��� ���� ����(1~500000)
		int m = scan.nextInt();
		
		//�־��� ���� ����(�������)
		//������ ������ �������� ������ �󵵼��� �迭�� ����������
		//�������� ���� ������ ��������� ������ �󵵼��� HashMap�� �����ϴ�.
		HashMap<Integer,Integer> givenMap = new HashMap<Integer,Integer>(m);
		for(int i = 0; i < m; i++) {
			givenMap.put(scan.nextInt(), 0);
		}

		
		//binarySearch �� value�� ����
		Set<Entry<Integer, Integer>> set = givenMap.entrySet();
		Iterator<Entry<Integer, Integer>> it = set.iterator();
		while(it.hasNext()) {
			int key = ((Entry<Integer, Integer>) it.next()).getKey();
			if(binarySearch(key, hasArr) != 0) {
				if(givenMap.get(key)!=null) {
					int value = givenMap.get(key);
					givenMap.put(key, value+1);
				}else {
					givenMap.put(key, 1);
				}
			}
			System.out.print(givenMap.get(key)+" ");
		}
		
		
		scan.close();
		
		System.out.println("\n�ҿ�ð� : "+(System.currentTimeMillis()-startTime));
		
	}//end main

	static int binarySearch(int key, int[] hasArr) {
		//key���� �ش��ϴ� ���� ���� ��ȯ
		
		
		return 0;
	}
	
}
