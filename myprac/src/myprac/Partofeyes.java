package myprac;

public class Partofeyes {
	
public static void Purposeofparts(String part7,String part, String part1, String part2,String part3,String part4,String part5){
		System.out.println(part7 +"  It functions like a window that controls and focuses the entry of light into the eye");
		System.out.println(part  +" It protects the Retina.");
		System.out.println(part1 +" It provides a huge blood supply (nutritions) to the retina(rods and cones) "
				+"\n         " +"because they convert the light energy into electrochemical energy of action potential "
				+ "\n        "   +" which requires them to consume lots of energy.");
		System.out.println( part2+" It's a hole in the Iris and can be larger and smaller "
				+"\n         "  +"depending on the intensity of the light in different circumstanes.");
		System.out.println(part3 +" responsible for controlling the diameter and size of the pupil and thus the amount of light reaching the retina.");
		System.out.println(part4 +" It let the light pass and helps the light to focus properly on the retina.");
		System.out.println(part5 +" The retina is a light-sensitive layer at the back of the eye that covers about 65 percent of its interior surface."
				+"\n            "+" Photosensitive cells called rods and cones in the retina convert incident light energy into"
			    +"\n            "+" signals that are carried to the brain by the optic nerve");
		
}public static void PartsofRetina(String pigmentedlayer, String Lightsensitivelayer){
		System.out.println("There are two layers of Retina:" 
				           + "1." + pigmentedlayer + " 2." + Lightsensitivelayer+ " (Rods & Cones)");

}public static void Lightsensitivelayer(String rods, String cones){
	System.out.println(rods+ "");
	System.out.println(cones+ "");
}

	
	
	
	
	
public static void main(String[] args) {
		Eyes parts = new Eyes ("Cornea","Pupil","Iris","Lens","Sclera","Choroid","Retina");
		System.out.println("----Different part of the eyes----");
		System.out.println("First part: " + parts.getFirstpart() + "\n"+ "Second part: " + parts.getSecondpart() 
		+"\n"+ "Third part: " + parts.getThirdpart()+"\n"+ "Forth part: "+ parts.getForthpart()
		+"\n"+ "Fifth part: "+parts.getFifthpart()+"\n"+ "Sixth part: " +parts.getSixthpart()+
		"\n"+ "Seventh part: " + parts.getSeventhpart());

		System.out.println("");
		System.out.println("----Purpose of different parts----");
		System.out.println("");

		Purposeofparts("Cornea:","Sclera:","Choroid:","Pupil:","Iris:","Lens: ","Retina:");

		PartsofRetina("pigmented layer", "Lightsensitive layer");
	
		Lightsensitivelayer("Rods: ","Cones: ");
	
	}
	
	

}
