package pkg;

public class CVMath {		
	public void getspecialSquare(){
		int x = 0;
		for (int i = 1; true; i++){
			int perf = i * i;
			for (int c = 1; c < perf; c++){
				x = x + c;
				if (x == perf){
					System.out.println(perf);
				}
				else if (x > perf){
					break;
				}
			}
		}
	}
	//public static int findMid(int one, int two, int three)
	//{
		//return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	//}
	
}
