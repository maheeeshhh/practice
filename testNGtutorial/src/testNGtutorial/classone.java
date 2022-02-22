package testNGtutorial;

import org.testng.annotations.Test;

public class classone {
	@Test
	public void clssroom() {
		System.out.println("govinda");
		
	}
	@Test(groups={"smoke"})
	public void college() {
		System.out.println("namasthe");
		
	}
@Test
public void lasttestcase() {
	System.out.println("end");
	
}
}
