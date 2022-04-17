package _01_응용;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Ex1_10816_숫자카드4 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
        
		//첫째줄 입력
        String N = reader.readLine();
        
        //상근 숫자 받을 트리맵
		TreeMap<Integer,Integer> sangMap = new TreeMap<Integer,Integer>();
		
		token = new StringTokenizer(reader.readLine());
		
		//둘째줄 입력 문자열을 트리맵에 K,V로 삽입
		while (token.hasMoreTokens()) {
			int input = Integer.parseInt(token.nextToken());
			if (sangMap.containsKey(input)) {
				int value = sangMap.get(input) + 1;
				sangMap.put(input, value);
			}else {
				sangMap.put(input, 1);
			}
		}

		//세번째줄 입력
		int M = Integer.parseInt(reader.readLine());
		
		//찾을 값을 담을 변수, 찾고 난 카운트 수 담을 결과
		int searchNum;
        int result;
        
        token = new StringTokenizer(reader.readLine());
		
        //네번째줄 입력 문자열의 숫자가 상근맵에 있는지 하나씩 확인
        //***출력할때 StringBuilder쓰기
		while (token.hasMoreTokens()) {
			searchNum = Integer.parseInt(token.nextToken());
            result = sangMap.containsKey(searchNum)? sangMap.get(searchNum) : 0;
            System.out.print(result + " ");
		}
	}//end main
}
