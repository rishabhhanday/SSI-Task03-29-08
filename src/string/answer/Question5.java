package string.answer;

public class Question5 {

	public static void main(String[] args) {
		boolean palindrome = true;
		String string = "asdsdsa";
		
		//System.out.println(name.charAt(name.length()-1));
		outer:
		for(int i =0;i<(string.length()/2);i++){
			if(string.charAt(i) != string.charAt(string.length() - (i+1))){
				palindrome = false;
				break outer;
			}
			
			
		}
		System.out.println(string+" is palindrome ? Ans :-"+palindrome);
	}

}
