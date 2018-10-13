import java.util.Scanner;
public class FindDuplicateCount {

	public static void main(String[] args) {
		
		
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		
		int count = 0;
		for (int i=0; i<arr.length; i++ ){
			int Item = arr [i];
			count= 0;
			for (int j=i+1; j<arr.length; j++){
			     if( Item == arr[j]){
				count++;
			}
			}
		 if (count==0){
			System.out.println("No duplicates with value " +  Item + " beyond Index " + i  );
		} else if (count ==1) 
			System.out.println("There is only 1 more occurrence of value "+ Item + " starting at index " + i );
		else {
			System.out.println("There are " + count + " more occurrences of value " + Item + " starting at index " + i);
		}
			
			}
		}
}
	


