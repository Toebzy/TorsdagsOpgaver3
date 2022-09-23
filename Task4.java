class Task4{

	static public void fibonacci(int i, int i2){
		int phi=0;
		if(i!=0 && i+i2<1000){
			phi=i+i2;
			i=i2;
			i2=phi;
			System.out.println(phi+" ");
			fibonacci(i,i2);
		}
		else if(i==0){
			System.out.println(i+" ");
			System.out.println(i2+" ");
			phi=i+i2;
			i=i2;
			i2=phi;
			System.out.println(i2+" ");
			fibonacci(i,i2);
		}
	}
	public static void main(String[] args) {
		fibonacci(0,1);	

	}	
}