package _01_����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Ex1_10816_����ī��4 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
        
		//ù°�� �Է�
        String N = reader.readLine();
        
        //��� ���� ���� Ʈ����
		TreeMap<Integer,Integer> sangMap = new TreeMap<Integer,Integer>();
		
		token = new StringTokenizer(reader.readLine());
		
		//��°�� �Է� ���ڿ��� Ʈ���ʿ� K,V�� ����
		while (token.hasMoreTokens()) {
			int input = Integer.parseInt(token.nextToken());
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
        
        token = new StringTokenizer(reader.readLine());
		
        //�׹�°�� �Է� ���ڿ��� ���ڰ� ��ٸʿ� �ִ��� �ϳ��� Ȯ��
        //***����Ҷ� StringBuilder����
		while (token.hasMoreTokens()) {
			searchNum = Integer.parseInt(token.nextToken());
            result = sangMap.containsKey(searchNum)? sangMap.get(searchNum) : 0;
            System.out.print(result + " ");
		}
	}//end main
}
