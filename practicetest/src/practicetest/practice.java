package practicetest;

public class practice {

	public static void printBirthday(Birthday bd) {
		System.out.println(bd.getName() + "'s birthday is " + bd.getMonth() +"/" + bd.getDay() + "/" + bd.getYear());
	}
	
public static void main(String[] args) {
	Birthday Akbor = new Birthday("Akbor", 29, 12,1996);
	Birthday Newaz = new Birthday("Newaz",29,12,1996);
	Birthday Babar = new Birthday("Babar",23,7,1993);
	Birthday Heru = new Birthday("Heru",23,7,1991);
	Birthday Ammu = new Birthday("Ammu",23,7,1971);
	Birthday samia = new Birthday ("Samia",8,07,1997);
System.out.println("Family members");

printBirthday(Akbor);
printBirthday(Newaz);
printBirthday(Babar);
printBirthday(Heru);
printBirthday(Ammu);

System.out.println("");
System.out.println("My love - - ");
System.out.println("         -");

printBirthday(samia);

}
}