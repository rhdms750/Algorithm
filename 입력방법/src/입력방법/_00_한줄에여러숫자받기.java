package 입력방법;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _00_한줄에여러숫자받기 {
private static int N;
private static int M;
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine());
		
		//첫번째로 받은 수가 리스트 크기일때
		N = Integer.parseInt(token.nextToken());
		M = Integer.parseInt(token.nextToken());
		
		while(N>0) {
			//ArrayList에 M을 하나씩 넣기
			N--;
		}
	}
}
