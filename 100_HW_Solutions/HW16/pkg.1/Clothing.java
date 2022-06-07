package pkg;

public class Clothing {		
	double price;
	String ClothingProducer;
	
	public Clothing(double price, String ClothingProducer){
		this.price = price;
		this.ClothingProducer = ClothingProducer;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	public void setClothingProducer(String ClothingProducer){
		this.ClothingProducer = ClothingProducer;
	}
	public String getClothingProducer(){
		return ClothingProducer;
	}
	public void thankYou(){
		System.out.println("Thank You for shopping!");
	}
}
