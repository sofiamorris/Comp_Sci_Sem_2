package pkg;

public class Shirts extends Clothing {	
	String material;
	public Shirts(){
		super(10.0, "Target");
		material = "cotton";
	}
	public Shirts(double price, String ClothingProducer, String material){
		super(price, ClothingProducer);
		this.material = material;
	}
	public void setMaterial(String material){
		this.material = material;
	}
	public String getMaterial{
		return material;
	}
}
