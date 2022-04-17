package _01_구현_시뮬레이션;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex2_4673_셀프넘버 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(100);
//		map = getSelfNum(100);
		Set<Entry<Integer, Integer>> set = map.entrySet();
		Iterator<Entry<Integer, Integer>> it = set.iterator();
		
		while(it.hasNext()) {
			if(it.next().getValue() == 0) {
				System.out.print(it.next().getKey() + ", ");
			}
		}
		
	}

	//자릿수 구하는 메소드
	static int getDigit(int number) {
		return number/10+1;
	}
	
	//각 자릿수를 구하는 함수
	static int getDigitPlus(int number) {
		
		if (number < 10) {
			return number;
		}
		
		//자릿수
		int digit = getDigit(number);
				
	    //각 자릿수를 더하는 함수
		//y = x(1+10..+10*digit)+(x%10)
		int result = 0;
		for (int k = 1; k / 10 < digit; k = k * 10) {
			if(k / 10 != digit) {
				result += number / k;
			}else {
				result += number % (digit * 10);
			}
		}		
		return result;
	}//getJarikPlus()
	
	//셀프 맴버 구하는 함수
//	static HashMap<Integer,Integer> getSelfNum(int max) {
//		//1~max 넣을 리스트
//		HashMap<Integer,Integer> allMap = new HashMap<Integer,Integer>(max);
//		
//		int digitPlus = 0;
//		for (int i = 1; i <= max; i++) {
//			digitPlus = getDigitPlus(i);
//			allMap.put(i, 0);
//		}
//		
//	    List<Integer> list = new ArrayList<Integer>();
//		int key = 0;
//	    Set<Entry<Integer, Integer>> set = allMap.entrySet();
//	    Iterator<Entry<Integer, Integer>> it = set.iterator();
//	    
//	    while (it.hasNext()) {
//	    	if(allMap.)
//	    }
//		
//		return allMap;
//	}
}
