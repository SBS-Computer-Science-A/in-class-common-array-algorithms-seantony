package hello;

public class LargestValue {
	public static int largestValue(int[] arr) {
		int largest = arr[0];
		for (int i = 1;i<arr.length;i++) {
			if (arr[i]>largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,4,6,100};
		System.out.println(largestValue(arr));
	}
}
