package rough;

import java.util.Date;

public class Practice {

	public static void main(String[] args) {

		Date d = new Date();
		String newDate = d.toString().substring(4, 18).replace(" ", "_");
		System.out.println(d.toString());
		
		
		
	}

}


// Tue Sep 06 00:57:55 IST 2022