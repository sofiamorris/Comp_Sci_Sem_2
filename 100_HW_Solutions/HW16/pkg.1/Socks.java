package pkg;

public class Socks extends Clothing {		
	String type;
	public Socks(){
		super(4.0, "Nike");
		type = "crew";
	}
	public Socks(double price, String ClothingProducer, String type){
		super(price, ClothingProducer);
		this.type = type;
	}
	public void setType(int type){
		this.type = type;
	}
	public int getType(){
		return type;
	}
	public void thankYou(){
		super.thankYou();
		System.out.println("May your feet always be warm :)");
	}
}
