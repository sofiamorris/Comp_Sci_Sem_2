package pkg;
import java.util.Scanner;
import java.util.Random;


public class Maths extends Course {
	String Difficulty;
	public Maths() {
		Difficulty = "hard";
	}
	public Maths(String Difficulty){
		this.Difficulty = Difficulty;
	}
	public Maths(String teacher, int grade, String Difficulty){
		super(teacher, grade);
		this.Difficulty = Difficulty;
	}
	public String getDifficulty(){
		return Difficulty;
	}

}

