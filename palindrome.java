class palindrome{
	public static void main(String[] args){
		palindrome pc = new palindrome("Den laks skal ned");
		System.out.println(pc.palcheck());
	}
		String pal;
		palindrome(String pal){
			this.pal=pal;
		}
		String palcheck(){
			String pal2 = pal.toLowerCase();
			String plh="";
			for(int i = pal2.length() - 1; i >= 0; i--){
				plh=plh+pal2.charAt(i);
			}
			if(pal2.equals(plh)){
				return pal;
			}
			return "";
		}
	}
