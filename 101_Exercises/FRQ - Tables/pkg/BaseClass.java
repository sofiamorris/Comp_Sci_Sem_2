package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable extends SingleTable{
	int seats;
	double height;
	double viewquality;
	double desirability;
	SingleTable a;
	SingleTable b;
	public CombinedTable(SingleTable a,SingleTable b){
		this.a = a;
		this.b = b;
	}
	public boolean canSeat(int people){
		seats = (a.getNumSeats() + b.getNumSeats()) - 2;
		if(people <= seats){
			return true;
		}
		else{
			return false;
		}
	}
	public double getDesirability(){
		viewquality = (a.getViewQuality() + b.getViewQuality(b))/2;
		heighta = a.getHeight();
		heightb = b.getHeight();
		if (heighta = heightb){
			return viewquality;
		}
		else{
			return viewquality-10;
		}
	}
}

