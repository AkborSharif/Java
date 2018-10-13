package square;

public class SquareNum {

	public static void main(String[] args) {
		int arr [] = {1,2,3,4,2,3};
		System.out.println("Max: " + Square (arr));
	}
    public static int Square(int [] arr){
    int	Squared =0; int max=0;
    	for (int i=0; i<arr.length; i++){
    		System.out.println(Squared = arr[i]*arr[i]);
    		if (Squared>max){
    			max = Squared;
    		}
    	}
		return max;
    	
    }
}
