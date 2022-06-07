package pkg;

public class DesignerShirts extends Shirts {		
	String brand;
	public DesignerShirts(){
	    super(300.0, "Kering");
	    brand = "Gucci";
	}
	public DesignerShirts(double price, String ClothingProducer, String brand){
	    super(price, ClothingProducer);
	    this.brand = brand;
	}
	public void setBrand(String brand){
	    this.brand = brand;
	}
	public String getBrand(){
	    return brand;
	}
	public void thankYou(){
	    System.out.println("Thank You for spending your whole paycheck with us!")
	}
}
