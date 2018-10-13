
public class Fruits {

	protected String Names;
	protected double Prices;
	protected double Amounts;
	public static int numFruits;
	
	public Fruits(){
		Names = "";
		Prices = 0;
		Amounts= 0;
		numFruits++;
	}	 
	public Fruits(String name){
		Names =name;
		Prices = 0;
		Amounts= 0;
		numFruits++;			
	}
	public Fruits(String name, double prices){
		Names =name;
		Prices = prices;
		Amounts = 0;
		numFruits++;
	}
	public String getNames() {
		return Names;
	}
	public void setNames(String names) {
		Names = names;
	}
	public double getPrices() {
		return Prices;
	}
	public void setPrices(double prices) {
		Prices = prices;
	}
	public double getAmounts() {
		return Amounts;
	}
	public void setAmounts(double amounts) {
		Amounts = amounts;
	}
	
	}


