package _01_����_�ùķ��̼�;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex2_4673_�����ѹ� {

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

	//�ڸ��� ���ϴ� �޼ҵ�
	static int getDigit(int number) {
		return number/10+1;
	}
	
	//�� �ڸ����� ���ϴ� �Լ�
	static int getDigitPlus(int number) {
		
		if (number < 10) {
			return number;
		}
		
		//�ڸ���
		int digit = getDigit(number);
				
	    //�� �ڸ����� ���ϴ� �Լ�
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
	
	//���� �ɹ� ���ϴ� �Լ�
//	static HashMap<Integer,Integer> getSelfNum(int max) {
//		//1~max ���� ����Ʈ
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
