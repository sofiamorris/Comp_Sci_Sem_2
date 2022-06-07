package pkg;
import java.util.Scanner;
import java.util.Random;


public class History extends Course {
	int Era; 
	public History() {
		Era = 1700;
	}
	public History(int Era){
		this.Era = Era;
	}
	public History(String teacher, int grade, int Era){
		super(teacher, grade);
		this.Era = Era;
	}
	public int getEra(){
		return Era;
	}
}

