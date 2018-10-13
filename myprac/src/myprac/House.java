package myprac;

public class House{
       private String Name;
       private int Stories;
       private int Doors;
       private int Bathrooms;
       private int Bedrooms;
       private double Pricepermonth;
public House (String name, int floors, int doors, int bathrooms, int bedrooms,double pricepermonth ){
	Name = name;
	Stories = floors;
	Doors = doors;
	Bathrooms = bathrooms;
	Bedrooms = bedrooms;
	Pricepermonth = pricepermonth;
	
	
} public void setName(String name){
	Name = name;
}public String getName(){
	return Name;
	
}public void setStories(int floors){
	Stories = floors;
}public int getStories(){
	return Stories;
	
} public void setDoors(int doors){
	Doors = doors;
}public int getDoors(){
	return Doors;
	
} public void setBathrooms(int bathrooms){
	Bathrooms=bathrooms;
}public int getBathrooms(){
	return Doors;
}

public void setBedrooms(int bedrooms){
	Bedrooms = bedrooms;
}public int getBedrooms(){
	return Bedrooms;
}

public void Pricepermonth(int pricepermonth){
	
		Pricepermonth = pricepermonth;
}
	 public double getPricepermonth(){
		return Pricepermonth;
	}



}