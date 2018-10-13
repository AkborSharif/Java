import java.util.Scanner;
public class duplicate {

	public static void main(String[] args) {
		
		int [] array = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		int count =0;
		for (int i=0;i<array.length;i++ ){
		int	item = array [i];
		count = 0;
		    for (int j=i+1;j<array.length; j++){
		    	if (item == array[j]){
				count++;
			}	
			}
		if (count==0){
			System.out.println("There is no duplicate value " + item + " beyond Index " + i);
		}else if(count==1) 
			System.out.println("There is only 1 more occurrence of value "+ item + " starting at index " + i);
		else {
			System.out.println("There are "+ count + " more ocurances of " + item + " starting at index " + i);
		}
		}
	}

}
