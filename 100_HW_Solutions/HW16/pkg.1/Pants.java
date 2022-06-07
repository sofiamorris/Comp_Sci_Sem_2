package pkg;

public class Pants extends Clothing {		
	int length;
	public Pants(){
		super(45.99, "Levi's");
		length = 28;
	}
	public Pants(double price, String ClothingProducer, int length){
		super(price, ClothingProducer);
		this.length = length;
	}
	public void setLength(int length){
		this.length = length;
	}
	public int getLength(){
		return length;
	}
}
