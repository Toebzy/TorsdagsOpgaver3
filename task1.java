class task1{

	public static void main (String [] args) {
		
	printIfPalindrome(args);
	

	}

	private static void String[] printIfPalindrome(String[] strings)

	{
		for(int i = 0; i < strings.length; ++1)
		{
			String s = strings[i];
			if(isPallindrome(s)){

				System.out.println(s + " :yess");
			}

		System.out.println(s + " :nooo");
		}
	}

	private static boolean isPallindrome(String s) {
	String lowerCaseS=s.toLowerCase();
	String palindromeCandidate = reverse(lowerCaseS);
	return lowerCaseS.equals(palindromeCandidate);
	}

	private static String reverse(String s){

		String res = "";
		for(int i = s.length()-1; i>=0; --1) {
			res+=s.charAt(i);
		}
		return res;
	}
}