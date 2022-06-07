package pkg;
import java.util.Scanner;
import java.util.Random;


public class Course {
	String teacher;
	int grade;
	int credit;
	public Course() {
		teacher = "Mr.Poole";
		grade = 95;
		credit = 4;
	}
	public Course(String teacher, int grade){
		this.teacher = teacher;
		this.grade = grade;
	}
	public void calcCredit(){
		if (grade >= 90){
			credit = 4;
		}
		else if (grade >= 80 && grade < 90){
			credit = 3;
		}
		else if (grade >= 70 && grade <80){
			credit = 2;
		}
		else if (grade >= 60 && grade < 70){
			credit = 1;
		}
		else{
			credit = 0;
		}
	}
	public int getCredit(){
		return credit;
	}
	public String getTeacher(){
		return teacher;
	}
	public String toString(){
		return (teacher + "'s class gave me " + credit + " credits.");
	}
	public boolean equals(Object other){
		if(!(other instanceof Course)){
			return false;
		}
		else{
			return this.teacher == ((Course)other).getTeacher();
		}
	}
}

