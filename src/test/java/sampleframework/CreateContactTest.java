package sampleframework;

import org.testng.annotations.Test;

public class CreateContactTest {

	@Test
	public void createContact() {
		System.out.println("==============contact created=============");
	}
	
	@Test
	public void createProduct() {
		System.out.println("==========product created============");
	}
	@Test
	public void createProductandDeleted() {
		System.out.println("==========product deleted============");
	}
}
