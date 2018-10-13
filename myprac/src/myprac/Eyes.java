package myprac;

public class Eyes {
public String Firstpart;
public String Secondpart;
public String Thirdpart;
public String Forthpart;
public String Fifthpart;
public String Sixthpart;
public String Seventhpart;


public Eyes (String Cornea,String Pupil,String Iris,String Lens,String Sclera,String Choroid, String retina){
	Firstpart = Cornea;
	Secondpart = Pupil;
	Thirdpart = Iris;
	Forthpart = Lens;
	Fifthpart= Sclera;
	Sixthpart = Choroid;
	Seventhpart = retina;
	
	
} private void setFirstpart(String Cornea){
	Firstpart = Cornea;
}public String getFirstpart(){
	return Firstpart;
}

private void setSecondpart(String Pupil){
	Secondpart = Pupil;
}public String getSecondpart(){
	return Secondpart ;
}

private void setThirdpart(String Iris){
	Thirdpart = Iris;
}public String getThirdpart(){
	return Thirdpart ;
}
private void setForthpart(String Lens){
	Forthpart = Lens;
}public String getForthpart(){
	return Forthpart;
}
public void setFifthpart(String Sclera){
	Fifthpart= Sclera;
}public String getFifthpart(){
	return Fifthpart;
}

private void setSixthpart(String Choroid){
	Sixthpart = Choroid;
}public String getSixthpart(){
	return Sixthpart;
}

private void setSeventhpart(String Retina){
	Seventhpart = Retina;
}public String getSeventhpart(){
	return Seventhpart;
}



}