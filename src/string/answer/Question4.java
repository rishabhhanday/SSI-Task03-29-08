package string.answer;

public class Question4 {
public static void main(String...sd){
	String str= "this is java and java is object oriented and java is powerful. I love java language";
	int count =0;
	int index = 0;
	while(str.indexOf("java", index)!= -1){
		index = str.indexOf("java", index);
		//System.out.println(index);
		index++;
		count++;
		
	}
	System.out.println(count);
	
}
}
