import java.util.Random;
class MathWork{
	public static void main(String[] args){
		divisible(3);
		int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10};
		System.out.println(getRandom(arr));
	}
	static void divisible (int number){
		for(int i=0; i<100; i++){
			if(i%number==0){
				System.out.println(i);
			}
		}
	}
	static int getRandom(int[] arr){
	Random r = new Random();
	int randomindex = r.nextInt(arr.length);
	return arr[randomindex];
}
}