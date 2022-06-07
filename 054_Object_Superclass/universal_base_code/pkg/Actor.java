package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer {
	String type;
	public Actor(){
		type = "theater";
	}
	public Actor(String name, String type){
		super(name);
		this.type = type;
	}
	public void practice(){
		System.out.println(super.getName() + " recites lines by themself.");
		return;
	}
	public void perform(){
		System.out.println(super.getName() + " performs on stage to a massive crowd.");
		return;
	}
	public void monologue(){
		System.out.println("If I was a girl in a book this would all be so easy. Just give up the world happily. I've always been quite content with my family, I don't understand it. Perhaps I was too quick in turning him down, Laurie. If he asked me again I think I would say yes. Do you think he'll ask me again? I care more to be loved, I want to be loved. I just feel like women, they have minds and they have souls as well as just hearts. And they've got ambition and talent as well as just beauty, and I'm so sick of people saying love is all a woman is fit for. I'm so sick of it, but I'm so lonely.");
		return;
	}
}
	


