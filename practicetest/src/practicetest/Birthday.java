package practicetest;

public class Birthday {
public String Name;  
private int Day;
private int Month;
private int Year;

public Birthday(String name, int Date, int Month, int Year){    //constructor
	this.Name=name;
	this.Day = Date;
	this.Month =Month;
	this.Year = Year;
}
public void setName(String newName) { // Mutator 
	Name = newName;
	
}public void setMonth(int Month){
	if(Month>0 && Month<=12){
	this.Month = Month;
}else
	System.out.print("error");
}public void setDay(int Day){
	 if (Day>0 && Day<=31){
		 this.Day = Day;
	 }else 
		 System.out.println("error");
	 }
 public void setYear(int Year) { // Mutator 
			this.Year = Year;
			}
	 public String getName(){  //accesssor
			return Name;
		}public int getMonth(){
			return Month;
		}public int getDay(){
			return Day;
		}public int getYear (){
			 return Year;
		}
	
 }

