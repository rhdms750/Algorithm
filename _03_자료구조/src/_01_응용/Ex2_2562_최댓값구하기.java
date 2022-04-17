package _01_응용;

import java.io.*;
import java.util.*;

//문제 링크 : https://www.acmicpc.net/problem/2562

public class Ex2_2562_최댓값구하기 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		
		//입력받은 숫자를 리스트에 삽입
		List<Integer> list = new ArrayList<Integer>(9);
		String input;
		
		while ((input = reader.readLine())!=null) {
			list.add(Integer.parseInt(input));
		}
		
		//최댓값 출력
		int max = Collections.max(list);
		System.out.println(max);
		
		//인덱스 출력
		int index = list.indexOf(max);
		System.out.println(index+1);
	
	}//end main
}
