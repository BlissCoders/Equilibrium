package aequilibriumAssessment.stepdefs;

import org.junit.Assert;

import io.cucumber.java.en.Then;

import page.functions.FunctionInventory;

public class InventoryStepDefinitions {
	
	@Then("I should be in the inventory page")
	public void i_should_be_in_the_inventory_page() {	    
		Assert.assertTrue(FunctionInventory.isInPageInventory());		
	}

}
