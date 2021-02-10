package Array;

public class MinArray {
	public static void max(int arr[]) {
		int max=arr[0];
		for(int i=1; i<arr.length;i++) 
			if (max<arr[i]) 
				max=arr[i];
				}

	public static void main(String[] args) {
		int a[]= {33,3,4,5};
		max(a);


	}

}
