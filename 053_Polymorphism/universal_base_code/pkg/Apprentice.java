package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician {
	String school;
	int yearsOfExperience;
	public Apprentice(){
		school = "CVHS";
		yearsOfExperience = 0;
	}
	public Apprentice(String school, int yearsOfExperience){
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String instrument, String school, int yearsOfExperience){
		super(instrument);
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience){
		super(name, age, instrument);
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public void playInstrument(){
		System.out.println(getName() + " plays the " + getInstrument() + " okay.");
		return;
	}
	public void practice(){
		super.practice();
		System.out.println(getName() + " has played for " + yearsOfExperience + " years.");
		return;
	}
	public void perform(){
		super.perform();
		System.out.println("The performance needs some work still.");
		return;
	}
	public void practiceAtUniversity(){
		super.practice();
		System.out.println(getName() + " practices " + getInstrument() + " at " + school);
		return;
	}
}
	


