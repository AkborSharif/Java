import java.util.Arrays;
import java.util.Scanner;
public class DataAnalyze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Size =0;
		System.out.print("Please enter the sample size: " );
          int size = input.nextInt();
          
          int [] array1 = new int [size];
          int [] array2 = new int [size];
          int [] array3 = new int [size];
          int [] array4 = new int [size];
          
          int sum1 = 0; int sum2 = 0; int sum3 = 0; int sum4 =0;
          int average1 = 0;int average2 = 0;int average3 = 0;int average4 = 0;
          int trial;
        
          for (trial = 0; trial < 4; trial ++) {
        	  System.out.println("Enter numbers for Trial " + trial); 
        	  
        	  if (trial == 0){
        		  for (int i = 0; i<size; i++){
        			  System.out.print("Enter sample #" + i + ":" );
        			  array1 [i] = input.nextInt();
        			  sum1 += array1[i];
        		  }
        	     System.out.println("");
        		  }
        	  if (trial == 1) {
        		  for (int i = 0; i<size; i++){
        			  System.out.print("Enter sample #" + i + ":" );
        			  array2 [i] = input.nextInt();
        			  sum2 += array2[i];
        		  }
        		  System.out.println("");
        		  }
        	  if (trial == 2) {
        		  for (int i = 0; i<size; i++){
        			  System.out.print("Enter sample #" + i + ":" );
        			  array3 [i] = input.nextInt();
        			  sum3 += array3[i];
        		  }
        		  System.out.println("");
        		  }
        	  if (trial == 3) {
        		  for (int i = 0; i<size; i++){
        			  System.out.print("Enter sample #" + i + ":" );
        			  array4 [i] = input.nextInt();
        			  sum4 += array4[i];
        		}
        	
        	 }
        	  System.out.println("");
            }
                        average1 = sum1/size; average2 = sum2/size; average3 = sum3/size; average4 = sum4/size;
                        System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");
                        
                        for (int i= 0; i< size; i++) {
                        	System.out.println("\t"+i + " \t\t"+array1 [i] + "\t"+ array2 [i]  + "\t"+array3 [i] + "\t"+array4[i]);
                        }
                        	System.out.println("\t-----------------------------------------------------------");
                        	System.out.println(" \tAverage:" + " \t" + average1 + " \t" + average2 + " \t" + average3+ " \t" + average4 );
                        	System.out.println("");
                       
                        int[]average = {average1, average2, average3, average4};
                        Arrays.sort(average);
                        System.out.println("min average: " + average[0]);
                        System.out.println("max average: " + average[3]);
                        System.out.println("");                                                        
                     
                        
                        if (average [3] == average [0] ) {
                              System.out.println("The trials match EXACTLY!");
                       } else if ( average[3] < 2*average [0]) {
                        	  System.out.println("The trials concur with each other!");
                        } else { 
                        		System.out.println("The trials do not concur!"); 
                        
                        } 
          }
          
                
	

}
