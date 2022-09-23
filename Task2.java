public class Task2{
	public static void main(String[] args){
	String word = "København";
	int indexstart = 1;
	int amount = 5;
	String substring = printPartOfWord(word, indexstart, amount);
	System.out.println(substring);
	}
	public static String printPartOfWord(String word, int indexstart, int amount){
		return(word.substring(indexstart,amount));
	}
}