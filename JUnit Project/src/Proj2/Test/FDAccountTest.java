package Proj2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Proj2.Files.FDAccount;

class FDAccountTest {

	FDAccount fdAccount = new FDAccount();
	
	@Test
	public void setAmountTest() {
		fdAccount.setAmount(10000.0);
		assertEquals(10000.0, fdAccount.getAmount(), 0.0);
	}
	
	@Test
	public void getSetInterestTest() {
		fdAccount.setInterestRate(5);
		assertEquals(5, fdAccount.getInterestRate(), 0);
	}
	
	@Test
	public void getSetNoOfDaysTest() {
		fdAccount.setNoOfDays(91);
		assertEquals(91, fdAccount.getNoOfDays());
	}
	
	@Test
	public void getSetAgeOfACHolderTest() {
		fdAccount.setAgeOfACHolder(65);
		assertEquals(65, fdAccount.getAgeOfACHolder());
	}

	@Test
	public void calculateInterestTest() {
		fdAccount.setAmount(10000.0);
		fdAccount.setNoOfDays(91);
		fdAccount.setAgeOfACHolder(65);
		assertEquals(800.0, fdAccount.calculateInterest(), 0.0);
		
		fdAccount.setAmount(10000.0);
		fdAccount.setNoOfDays(91);
		fdAccount.setAgeOfACHolder(30);
		assertEquals(750.0, fdAccount.calculateInterest(), 0.0);
	}


}
