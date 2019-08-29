package string.answer;

public class Question9 {
public static void main(String...sd){
	String str = "ad3daddfd5443dfsfss";
	char[] ch = str.toCharArray();
	char[] ch1 = new char[str.length()];
	int index=0;
	for(int i =0;i<str.length();i++){
		if((int)ch[i] <=48 || (int)ch[i] >=57){
			ch1[index] = ch[i];
			index++;
		}
		
		
	}
	System.out.println(ch1);
	
}
}
