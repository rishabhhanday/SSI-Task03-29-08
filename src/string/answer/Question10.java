package string.answer;

import java.util.StringTokenizer;

public class Question10 {

	public static void main(String[] args) {
		String str = "1.java,2.oracle,3.python,4.php,5.linux,6.C++,7.C";
		char[] ch = str.toCharArray();
		for(int i =0;i<str.length();i++){
			if((int)ch[i] >=48 && (int)ch[i] <=57){
				ch[i] = '.';
				
			}
			
		}
		System.out.println(ch);
		StringTokenizer st2 =  new StringTokenizer(new String(ch), "..,"); 
	        while (st2.hasMoreTokens()) 
	            System.out.println(st2.nextToken()); 
	}

}
