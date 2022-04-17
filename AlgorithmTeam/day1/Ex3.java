package day1;

public class Ex3 {

	public static void main(String[] args) {
		//정렬 안 된 배열(중복수 없음)
		int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		
		int max = arr[0];
		int count = 0;
		for(int tmp : arr) {
			max = max<tmp? tmp : max;
			count++;
		}
		
		System.out.println("max : "+max);
		System.out.println("index : "+count);
	}

}
