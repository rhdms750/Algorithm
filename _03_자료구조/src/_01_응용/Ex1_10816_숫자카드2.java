package _01_응용;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

//문제 링크 : https://www.acmicpc.net/problem/10816

public class Ex1_10816_숫자카드2 {

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		
		//상근이 소유한 카드 갯수(1~500000)
		int N = Integer.parseInt(reader.readLine());
		
		//상근이 소유한 숫자카드를 담을 해쉬맵
		TreeMap<Integer,Integer> sangMap = new TreeMap<Integer,Integer>();
		
		//입력받은 상근이 소유한 숫자카드 문자열
		token = new StringTokenizer(reader.readLine());
		
		//입력받은 숫자를 해쉬맵에 삽입
		while (token.hasMoreTokens()) {
			int input = Integer.parseInt(token.nextToken());
			//이미 맵에 들어간 값이 있을 때
			if (sangMap.containsKey(input)) {
				int value = sangMap.get(input) + 1;
				sangMap.put(input, value);

			//맵에 한 번도 값이 들어간 적이 없을 때
			}else {
				sangMap.put(input, 1);
			}
		}
		
		//찾으려는 숫자 갯수
		int M = Integer.parseInt(reader.readLine());
		
		//찾으려는 숫자
		int searchNum;
		
		//입력창 네번째 줄
		token = new StringTokenizer(reader.readLine());
		
		//입력받은 값의 배열
		int[] givenArr = new int[M];
		
		int k = 0;
		while(token.hasMoreTokens()) {
			int input = Integer.parseInt(token.nextToken());
			givenArr[k] = input;
			k++;
		}
		
		//입력된 숫자 searchNum를 이진탐색으로 상근맵에서 조회
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
