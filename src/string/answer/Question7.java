package string.answer;

public class Question7 {

	public static void main(String[] args) {
		int previousComma = 0;
		int nextComma = 0;
		String str = "India,Australia,England,Canada";
		int count =0;
		int index = 0;
		while(str.indexOf(',', index)!= -1){
			index = str.indexOf(',', index);
			//System.out.println(index);
			index++;
			count++;
			
		}
		
		for(int i=0;i<count;i++){
			nextComma = str.indexOf(',', previousComma +1);
			System.out.println(str.substring(previousComma, nextComma));
			previousComma = nextComma;
			previousComma++;
			
		}
		System.out.println(str.substring(previousComma,str.length() -1));

	}

}
