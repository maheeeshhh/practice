package testNGtutorial;

import org.testng.annotations.Test;

public class personalloan {
	@Test
	public void loanrate() {
		System.out.println("loan rate start from 10.25pa");
	}
	@Test(groups={"smoke"})
	public void loanamount() {
		System.out.println("loan amount will be 50% of the incume");
	}

	@Test
	public void loanstatus() {
		System.out.println("Sanctioned");
	}
}
