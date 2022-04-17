package _01_응용;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Ex1_10816_숫자카드3 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
		//첫째줄 입력
        String N = reader.readLine();
        
        //상근 숫자 받을 트리맵
		TreeMap<Integer,Integer> sangMap = new TreeMap<Integer,Integer>();
		
		//둘째줄 입력 문자열을 트리맵에 K,V로 삽입
		for (String tmp : reader.readLine().split(" ")) {
			int input = Integer.parseInt(tmp);
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
		
        //네번째줄 입력 문자열의 숫자가 상근맵에 있는지 하나씩 확인
		for(String tmp : reader.readLine().split(" ")) {
			searchNum = Integer.parseInt(tmp);
            result = sangMap.containsKey(searchNum)? sangMap.get(searchNum) : 0;
            System.out.print(result + " ");
		}
	}//end main
}
