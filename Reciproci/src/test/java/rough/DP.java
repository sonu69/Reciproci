package rough;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP{
	
	@DataProvider(name="sameData")
	public String[][] getName() {
		
		String[][] name = new String[3][2];
		name[0][0]="Sonu";
		name[0][1]="Priya";
		name[1][0]="Frankly";
		name[1][1]="Abhishek";
		name[2][0]="Ragini";
		name[2][1]="Eima";
		
		return name;
		
	}
	
	
	@Test(dataProvider="sameData")
	public void showData(Object m) {
		System.out.println(m);
	}

	
	
}
