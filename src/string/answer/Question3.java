package string.answer;

public class Question3 {
public static void main(String...as){
	String str[] = {"bhopal","agra","mumbai","chennai","pune","delhi"};
	for(int i =0;i<str.length;i++){
		for(int j=0;j<str.length -1;j++){
			if(str[j].compareTo(str[j+1]) > 0){
				String temp = str[j];
				str[j] = str[j+1];
				str[j+1] = temp;
				//System.out.println("exvahnged");
			}
			
			
		}
		
		
	}
	for(String string : str){
		System.out.println(string);
		
	}

	
	
}
}
