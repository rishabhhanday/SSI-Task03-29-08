package string.answer;

public class Question8 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("avckaaaskcva");
		if(sb.toString().equals(sb.reverse().toString())){
			System.out.println("Yes it is palindrome");
			
		}
		else{
			System.out.println("No it is not palindrome");
		}
		

	}

}
