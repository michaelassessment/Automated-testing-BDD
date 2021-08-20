package testing.definitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testing.steps.VolunteerSignUpSteps;
import net.thucydides.core.annotations.Steps;

public class VolunteerSignUpDefinitions {
	
	@Steps
	VolunteerSignUpSteps volunteerSignup;
    
    // Given steps    
           
    @Given("^I am on the Volunteer Sign Up Page$")
    public void amIOnTheVolunteerSignupPage() {
    	volunteerSignup.amIOnTheVolunteerSignupPage();
    }
    
    // When steps
    
    @When("^I populate (.*), (.*), (.*), (.*), (.*), (.*) with (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void populateFields(String firstName, String lastName, String phone, String country, String city, String emailAddress, String firstNameValue, String lastNameValue, String phoneValue, String countryValue, String cityValue, String emailAddressValue)
    {
    	volunteerSignup.populateFields(firstName, lastName, phone, country, city, emailAddress, firstNameValue, lastNameValue, phoneValue, countryValue, cityValue, emailAddressValue);
    }
    
    @When("^I choose the Gender$")
    public void chooseGender(String gender)  {
    	volunteerSignup.chooseGender(gender);
    }
    
    @When("^I select the Day$")
    public void chooseDay(String day)  {
    	volunteerSignup.chooseDay(day);
    }
    
    @When("^I click the submit button$")
    public void clickSubmit()  {
    	volunteerSignup.clickSubmit();
    }
    
    // Then steps
    
    @Then("^the form fields (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) are present$")
    public void validateLocationMenuOptionsAccumulations(String firstName, String lastName, String phone, String country, String city, String emailAddress, String gender, String availibility, String time, String upload)  {
    	volunteerSignup.areFieldsPresent(firstName, lastName, phone, country, city, emailAddress, gender, availibility, time, upload);
    }
    
    @Then("^the submit button is present$")
    public void isSubmitButtonPresent() {
    	volunteerSignup.isSubmitButtonPresent();
    }
    
    @Then("^the form was submitted successfully$")
    public void isFormSubmittedSuccessfully()  {
    	volunteerSignup.isFormSubmittedSuccessfully();
    }
    
    @Then("^the new windows search input is present$")
    public void isNewWindowsSearchInputPresent() {
    	volunteerSignup.isNewWindowsSearchInputPresent();
    }
    
    @Then("^the new windows search submit button is present$")
    public void isNewWindowsSearchSubmitButtonPresent() {
    	volunteerSignup.isNewWindowsSearchSubmitButtonPresent();
    }
    
}