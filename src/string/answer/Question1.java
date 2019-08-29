package string.answer;

public class Question1 {
	public static void main(String... sd) {
		int gmail = 0;
		int yahoo = 0;
		int orkut = 0;

		String emails[] = { "ab@gmail.com", "xyz@yahoo.com", "cd@orkut.com", "ef@gmail.com", "gf@yahoo.com",
				"kpc@gmail.com" };
		for (int i = 0; i < emails.length; i++) {
			int index = emails[i].indexOf('@');
			index++;
			if (emails[i].charAt(index) == 'g')
				gmail++;
			if (emails[i].charAt(index) == 'y')
				yahoo++;
			if (emails[i].charAt(index) == 'o')
				orkut++;

		}
System.out.println("Gmail :"+gmail+" yahoo :"+yahoo+" orkut: "+orkut);

	}

}
