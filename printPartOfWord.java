public class Task{

	public static void main(String [] args){

		String substring = (printPartOfWord(København, 1, 4));
		System.out.print(substring); 

		
	}


		String printPartOfWord(String ord, int delM1, int delM2) {
		return(ord.substring(delM1, delM2));
		
		}
}
