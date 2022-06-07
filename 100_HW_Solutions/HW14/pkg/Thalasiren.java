package pkg;
import java.util.Scanner;
import java.util.Random;

public class Thalasiren implements Pet{
    String name;
    int age;
    boolean trained;
    public Thalasiren(){
        this("Ryan", 696, false);
    }
    public Thalasiren(int age){
        this("Ryan", age, false);
    }
    public Thalasiren(boolean trained){
        this("Ryan", 696, trained);
    }
    public Thalasiren(String name){
        this(name, 696, false);
    }
    public Thalasiren(String name, boolean trained){
        this(name, 696, trained);
    }
    public Thalasiren(String name, int age, boolean trained){
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
        System.out.println(getName() + " produces milk for its owner!");
        return;
    }
	public void trick(){
	    if (getIsTrained() == true){
	        System.out.println(getName() + " bottles its milk!");
	    }
	    else{
	        System.out.println(getName() + " lays on a rock!");
	    }
	}
}