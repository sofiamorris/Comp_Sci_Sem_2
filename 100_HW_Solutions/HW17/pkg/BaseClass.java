package pkg;

public class Robot {		
	
	private boolean forwardMoveBlocked(){
		if(facingRight == true && pos = hall.length){
			return true;
		}
		else if(facingRight != true && pos = 0){
			return true;
		}
		else{
			return false;
		}
	}
	private void move(){
		if(hall[pos] = 0 && pos < hall.length){
			pos++;
		}
		else if(hall[pos] > 0 && pos < hall.length){
			for(int i = 0; hall[pos] > 0; i++){
					hall[pos] = hall[pos] - 1;
					if(hall[pos] = 0){
					pos++;
					}
			}
		}
		else if(pos = hall.length && hall[pos] = 0){
			pos--;
		}
		else if(pos = hall.length && hall[pos] > 0){
			for(int i = 0; hall[pos] > 0; i++){
					hall[pos] = hall[pos] - 1;
					if(hall[pos] = 0){
					pos--;
					}
		}
	public int clearHall(){
		for(int i = 1; hallIsClear() == false; i++){
			move();
		}
		return i;
	}
	}
}
