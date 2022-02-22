package testNGtutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class carloan {
	@Test
	
	public void loanrate() {
		System.out.println("car loan starts from10%");
	}


@Test(dataProvider="getData")

public void Tenureperiod (String username,String password){
	System.out.println("minimu Tenureperiod 12 months ");
	System.out.println("username");
	System.out.println("password");
}
@DataProvider
public Object[][] getData() {
	Object[][] data =new Object [3][2];
	data [0][0]= "fistusername";
	data[0][1] ="firstpassword";
	data[1][0]="secondusername";
	data[1][1]="secondpassword";
	data[2][0]="thirsdpassword";
	data[2][1]="thirdpassword";
	return data;
	
	
}

@Test
public void Loanstatus() {
	System.out.println("Sanctioned");
}
}
