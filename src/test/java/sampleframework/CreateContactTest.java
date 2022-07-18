package sampleframework;

import org.testng.annotations.Test;

public class CreateContactTest {

	@Test
	public void createContact() {
		System.out.println("==============contact created=============");
		System.out.println("i ama lohith");
	}
	
	@Test
	public void createProduct() {
		System.out.println("<==========product created============>");
	}
	
	public void createCampaign()
	{
		System.out.println("==========Campaign created============");
	}
	@Test
	public void createProductandDeleted() {
		System.out.println("==========product deleted============");
	}
  @Test
	public void ModifyProduct() {
		System.out.println("==========product Modified by Divya.============");
	}
	

}
