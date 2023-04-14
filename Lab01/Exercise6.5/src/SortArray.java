import java.util.Arrays;
public class SortArray {
	public static void main(String[] args) {
		
		int[] arr = {123,142,54,653};
		Arrays.sort(arr);
		System.out.println("sorted array: " + Arrays.toString(arr));
		
		int sum = 0;
		for (int i = 0;i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of the array: " + sum);
		
		double avarage = sum/arr.length;
		System.out.println("The avarage value of the array: " + avarage);
	}
}
