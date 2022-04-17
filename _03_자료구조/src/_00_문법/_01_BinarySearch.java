package _00_¹®¹ý;

public class _01_BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int key = 3;
		
		int mid;
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			mid = (left+right)/2;
			
			if(key==arr[mid]) {
				System.out.println("index : "+mid);
				break;
			}
			
			if(key < arr[mid]) {
				right = mid-1;
			}else if(key > arr[mid]) {
				left = mid+1;
			}
		}//end while
	}//end main

}
