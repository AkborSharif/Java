
public class MinMaxReverse {

	public static void main(String[] args) {
		int[] arr = {1, 2, -3000, 4, 5, -100, 3, 50000, 700, 2, 4, 6, 8000};
		int[] rev_arr = new int [arr.length];

		int min = Integer.MAX_VALUE, minIndex = 0;
		int max = Integer.MIN_VALUE, maxIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
			min = arr[i];
			minIndex = i;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) { 
			max = arr[i];
			maxIndex = i;
			}
		}
		
		System.out.println("Min number is " + min + " found at index " + minIndex);
		System.out.println("Max number is " + max + " found at index " + maxIndex);

		System.out.println();
		System.out.println("\nPrinting out both array contents and they should be the same");
		for (int i = arr.length; i > 0; i--) {
			rev_arr[i-1] = arr[arr.length-i];
			System.out.print("Arr[" + (arr.length-i) + "]=" + arr[arr.length-i]);
			System.out.println("\tsame as \tRev_Arr[" + (i-1) + "]=" + rev_arr[i-1]);
		}

	}

}