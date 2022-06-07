class starter {
	public static int getMode(int[] a){
		int count = 0;
		int mode = 0;
		int modeval;
		for (int i = 0; i < a.length; i++){
			for(int x = 0; x < a.length; x++){
				if (a[i] == a[x]){
					count++;
					
				}
			}
			if (mode < count){
				mode = count;
				modeval = a[i];
			}
		}
	}
	public static int getMedian(int[] b){
		int l = b.length/2;
		if (b.length % 2 != 0){
			int o = b[l];
		}
		else{
			int e = b[l - 1];
		}
	}
	public static void main(String args[]) {
	
	}
}
