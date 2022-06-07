package pkg;
import java.util.Scanner;
import java.util.Random;


public class Science extends Course {
	String Field;
	public Science() {
		Field = "biology";
	}
	public Science(String Field){
		this.Field = Field;
	}
	public Science(String teacher, int grade, String Field){
		super(teacher, grade);
		this.Field = Field;
	}
	public String getField(){
		return Field;
	}
	
}

