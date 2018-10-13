package reverse;

public class rev {

public static int binearysearch(int[]array, int value){
		int first = array[0];
		int last = array.length-1;
		while(first<=last){
			int mid = (first+last)/2;
			
		if(array[mid]==value){
			return mid;
		}	
		else if (value>=array[mid]){
			first = mid+1;
		}
		else
			last = mid-1;
			
			
		}
		
		
		
		
		return -1;	
	}
	
public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		
		  System.out.println( "Before reversing: ");
   for(int i = 0; i<array.length; i++){
	  int elements = array[i] ;
	  
	
	  System.out.println( elements + " ");
	}   
   int position = binearysearch(array, 9);
	
   System.out.println("9 is at index: " + position );	 
  
    int first  = 0;
	int last = array.length-1;
	
   while(first < last){
	   int temp = array[first];
	   array [first] = array [last];
	   array [last] = temp;
	   first ++;
	   last--; 
   }
	   System.out.println("Array after reversing.");
	   
	   for(int j=0; j<array.length; j++){
	  
		  System.out.println( array[j] + " ");
		
   }
	   
   
  
	 
   
   
   
        
}
}


