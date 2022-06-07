package pkg;
import java.util.Scanner;
import java.util.Random;

public class Toad implements Pet{
    String name;
    int age;
    boolean trained;
    public Toad(){
        this("Tristen", 96, true);
    }
    public Toad(int age){
        this("Tristen", age, true);
    }
    public Toad(boolean trained){
        this("Tristen", 96, trained);
    }
    public Toad(String name){
        this(name, 96, true);
    }
    public Toad(String name, boolean trained){
        this(name, 96, trained);
    }
    public Toad(String name, int age, boolean trained){
        this.name = name;
        this.age = age;
        this.trained = trained;
        interact();
    }
    public void setName(String name){
        this.name = name;
        return;
    }
    public void setAge(int age){
        this.age = age;
        return;
    }         
    public void setIsTrained(boolean trained){
        this.trained = trained;
        return;
    }
    public String getName(){
        return name;
    }             	
    public int getAge(){
        return age;
    }                    
    public boolean getIsTrained(){
        return trained;
    }
    public void interact(){
        System.out.println(getName() + " sings for its owner!");
        return;
    }
	public void trick(){
	    if (getIsTrained() == true){
	        System.out.println(getName() + " does a backflip!");
	    }
	    else{
	        System.out.println(getName() + " jumps off the counter!");
	    }
	}
}