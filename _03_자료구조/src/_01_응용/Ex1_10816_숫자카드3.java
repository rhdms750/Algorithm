package _01_����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Ex1_10816_����ī��3 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
		//ù°�� �Է�
        String N = reader.readLine();
        
        //��� ���� ���� Ʈ����
		TreeMap<Integer,Integer> sangMap = new TreeMap<Integer,Integer>();
		
		//��°�� �Է� ���ڿ��� Ʈ���ʿ� K,V�� ����
		for (String tmp : reader.readLine().split(" ")) {
			int input = Integer.parseInt(tmp);
			if (sangMap.containsKey(input)) {
				int value = sangMap.get(input) + 1;
				sangMap.put(input, value);
			}else {
				sangMap.put(input, 1);
			}
		}

		//����°�� �Է�
		int M = Integer.parseInt(reader.readLine());
		
		//ã�� ���� ���� ����, ã�� �� ī��Ʈ �� ���� ���
		int searchNum;
        int result;
		
        //�׹�°�� �Է� ���ڿ��� ���ڰ� ��ٸʿ� �ִ��� �ϳ��� Ȯ��
		for(String tmp : reader.readLine().split(" ")) {
			searchNum = Integer.parseInt(tmp);
            result = sangMap.containsKey(searchNum)? sangMap.get(searchNum) : 0;
            System.out.print(result + " ");
		}
	}//end main
}
