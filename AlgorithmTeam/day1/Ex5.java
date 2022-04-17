package day1;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) throws Exception{
		//������ �� (���� ����, �ߺ� ���)
		List<Integer> list = new ArrayList<Integer>(20);
		System.out.print("������ �� �Է�(���� �� x) : ");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String s = scanner.next();
			if(s.equals("x")) break;
			list.add(Integer.valueOf(s));
		}
		
		//linear search
		int max = Collections.max(list);
		int index = list.indexOf(max);
		System.out.println("max : "+max);
		System.out.println("index : "+(index+1));
	}

}
