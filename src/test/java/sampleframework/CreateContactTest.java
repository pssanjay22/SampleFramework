package sampleframework;

import org.testng.annotations.Test;

public class CreateContactTest {

	@Test
	public void createContact() {
		System.out.println("==============contact created=============.");
	}
	
	@Test
	public void createProduct() {
		System.out.println("<==========product created============>.");
	}
	
	public void createCampaign()
	{
		System.out.println("<==========Campaign created============>");
	}
}
