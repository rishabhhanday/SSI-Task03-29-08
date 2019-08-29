package string.answer;

public class Question6 {
	static int small =0, capital=0,digits=0, symbols =0, spaces =0;
	public static void main(String...as){
	//char c = '7';
	//System.out.println((int)c);
	String str = "hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
	for(int i=0;i<str.length();i++){
		if((int)str.charAt(i) >= 97 &&  (int)str.charAt(i) <= 122){
			small++;
			
		}
		if((int)str.charAt(i) >= 65 &&  (int)str.charAt(i) <= 90){
			capital++;
			
		}
		if((int)str.charAt(i) >= 48 &&  (int)str.charAt(i) <= 57){
			digits++;
			
		}
		if((int)str.charAt(i) >= 33 &&  (int)str.charAt(i) <= 47){
			symbols++;
			
		}
		if((int)str.charAt(i) == 32 ){
			spaces++;
			
		}
		
		
	}
	System.out.println(" small Letter : "+small+"\n Captal Letters : "+capital+" \n Digits : "+digits+"\n symbols : "+symbols+"\n spaces : "+spaces);
	
}
}
