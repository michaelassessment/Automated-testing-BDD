package testing.definitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testing.steps.NewWindowsSearchSteps;
import net.thucydides.core.annotations.Steps;

public class NewWindowsSearchDefinitions {
	
	@Steps
	NewWindowsSearchSteps newWindowsSearch;
    
    // Given steps    
    
    @Given("^I am on the New Windows Search Page$")
    public void amIOnTheNewWindowSearchPage() {
    	newWindowsSearch.amIOnTheNewWindowSearchPage();
    }
    
    // When steps
    
    @When("^I enter search (.*)$")
    public void enterSearchText(String searchText) {
    	newWindowsSearch.enterSearchText(searchText);
    }
    
    @When("^I click on the submit button$")
    public void clickSubmitButton(){
    	newWindowsSearch.clickSubmitButton();
    }
    
    // Then steps
    
    @Then("^I can see some search results$")
    public void areSearchResultsVisible(){
    	newWindowsSearch.areSearchResultsVisible();
    }
    
    
    @Then("^I can see more search results$")
    public void isMoreSearchResultsVisible(){
    	newWindowsSearch.isMoreSearchResultsVisible();
    }
}