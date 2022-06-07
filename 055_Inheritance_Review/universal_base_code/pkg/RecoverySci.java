package pkg;
import java.util.Scanner;
import java.util.Random;


public class RecoverySci extends Science {

	public String getGrade(int grade){
		if (grade >= 60){
			return "pass";
		}
		else{
			return "fail";
		}
	}

}

