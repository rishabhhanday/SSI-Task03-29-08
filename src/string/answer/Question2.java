package string.answer;

public class Question2 {

	public static void main(String...sd){
		int cs =0;
		int ec =0;
		int mech = 0;
		
		String string[] = {"12345","34890","1285858","347070","560707","5697979","560707"};
		for(String str : string){
			if(str.indexOf("12") == 0)
				cs++;
			if(str.indexOf("34") == 0)
				ec++;
			if(str.indexOf("56") == 0)
				mech++;
			
				
			
		}
		System.out.println("Cs :"+cs+" ec: "+ec+" mech: "+mech);
	}
}

