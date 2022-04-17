package _01_응용;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//문제 링크 : https://www.acmicpc.net/problem/10816

public class Ex1_BinarySearch {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		Scanner scan = new Scanner(System.in);
		
		//상근이 소유한 카드 갯수(1~500000)
		int n = scan.nextInt();
		
		//상근의 숫자카드에 적혀있는 정수(-10000000~10000000)
		int[] hasArr = new int[n];
		for (int i = 0; i < n; i++) {
			hasArr[i] = scan.nextInt();
		}
		
		//상근의 숫자 카드 sort
		Arrays.sort(hasArr);
		
		//주어질 숫자 갯수(1~500000)
		int m = scan.nextInt();
		
		//주어진 숫자 순열(비순차적)
		//한정된 범위의 순차적인 값들의 빈도수는 배열이 적절하지만
		//한정되지 않은 범위의 비순차적인 값들의 빈도수는 HashMap이 적절하다.
		HashMap<Integer,Integer> givenMap = new HashMap<Integer,Integer>(m);
		for(int i = 0; i < m; i++) {
			givenMap.put(scan.nextInt(), 0);
		}

		
		//binarySearch 후 value값 증가
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
		
		System.out.println("\n소요시간 : "+(System.currentTimeMillis()-startTime));
		
	}//end main

	static int binarySearch(int key, int[] hasArr) {
		//key값에 해당하는 값의 갯수 반환
		
		
		return 0;
	}
	
}
