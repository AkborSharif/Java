package oop;

public class DecrementableCounter extends Counter  {
	
	public void decrement (){
		if (value()>0){
			int originalvalue = value();
			reset();
			for(int i=0; i<originalvalue-1; i++){
				increment();
			}
		}
	}
}

