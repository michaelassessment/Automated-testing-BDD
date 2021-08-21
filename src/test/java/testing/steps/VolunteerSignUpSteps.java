package testing.steps;

import testing.pages.AutomationTestingPracticePage;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import net.thucydides.core.annotations.Step;

public class VolunteerSignUpSteps {

	public AutomationTestingPracticePage automationTestingPractice;
	private static final String SUCCESS_MESSAGE = "The result storage capacity has been reached for this form. Your result was not created. Please contact the form owner.";

	@Step
	public void amIOnTheVolunteerSignupPage() {
		Assert.assertTrue(automationTestingPractice.amIOnTheVolunteerSignupPage());
	}
	
	@Step
	public void areFieldsPresent(String firstName, String lastName, String phone, String country, String city, String emailAddress, String gender, String availability, String time) {
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertTrue(automationTestingPractice.isFieldPresent(firstName));
		softAssert.assertTrue(automationTestingPractice.isFieldPresent(lastName));
		softAssert.assertTrue(automationTestingPractice.isFieldPresent(phone));
		softAssert.assertTrue(automationTestingPractice.isFieldPresent(country));
		softAssert.assertTrue(automationTestingPractice.isFieldPresent(city));
		softAssert.assertTrue(automationTestingPractice.isFieldPresent(emailAddress));
		softAssert.assertTrue(automationTestingPractice.isFieldPresent(gender));
		softAssert.assertTrue(automationTestingPractice.isFieldPresent(availability));
		softAssert.assertTrue(automationTestingPractice.isFieldPresent(time));
		softAssert.assertAll();
	}
	
	@Step
	public void isSubmitButtonPresent() {
		Assert.assertTrue(automationTestingPractice.isSubmitButtonPresent());
	}
	
	@Step
	public void populateFields(String firstName, String lastName, String phone, String country, String city,
			String emailAddress, String firstNameValue, String lastNameValue, String phoneValue, String countryValue,
			String cityValue, String emailAddressValue)
	{
		automationTestingPractice.populateField(firstName, firstNameValue);
		automationTestingPractice.populateField(lastName, lastNameValue);
		automationTestingPractice.populateField(phone, phoneValue);
		automationTestingPractice.populateField(country, countryValue);
		automationTestingPractice.populateField(city, cityValue);
		automationTestingPractice.populateField(emailAddress, emailAddressValue);
	}

	@Step
	public void chooseGender(String gender) {

		switch (gender.toLowerCase()) {
			case "male":
				automationTestingPractice.clickGenderMale();
				break;

			case "female":
				automationTestingPractice.clickGenderFemale();
				break;

			default:
				Assert.fail("Invalid gender value provided");
		}
	}

	@Step
	public void chooseDay(String day) {

		switch (day.toLowerCase()) {
			case "sunday":
				automationTestingPractice.clickDaySunday();
				break;

			case "monday":
				automationTestingPractice.clickDayMonday();
				break;

			case "tuesday":
				automationTestingPractice.clickDayTuesday();
				break;

			case "wednesday":
				automationTestingPractice.clickDayWednesday();
				break;

			case "thursday":
				automationTestingPractice.clickDayThursday();
				break;

			case "friday":
				automationTestingPractice.clickDayFriday();
				break;

			case "saturday":
				automationTestingPractice.clickDaySaturday();
				break;

			default:
				Assert.fail("Invalid day value provided");
		}
	}

	@Step
	public void clickSubmit() {
		automationTestingPractice.clickSubmit();		
	}

	@Step
	public void isFormSubmittedSuccessfully() {
		Assert.assertTrue(automationTestingPractice.isFormSubmittedSuccessfully(SUCCESS_MESSAGE));
	}

	@Step
	public void amIOnTheNewWindowSearchPage() {
		Assert.assertTrue(automationTestingPractice.amIOnTheNewWindowSearchPage());
	}

	@Step
	public void isNewWindowsSearchInputPresent() {
		Assert.assertTrue(automationTestingPractice.isNewWindowsSearchBoxPresent());		
	}

	@Step
	public void clickNewWindowsSearchSubmit() {
		automationTestingPractice.clickNewWindowsSearchBoxPresentSubmitButton();		
	}

	@Step
	public void isNewWindowsSearchSubmitButtonPresent() {
		automationTestingPractice.isNewWindowsSearchBoxSubmitButtonPresent();
	}

	public void uploadFile(String fileName) {
		automationTestingPractice.uploadFile(fileName);		
	}

	public void isUploadFileSectionPresent() {
		automationTestingPractice.isUploadFileSectionPresent();
	}
}
