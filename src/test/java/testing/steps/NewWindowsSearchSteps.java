package testing.steps;

import testing.pages.AutomationTestingPracticePage;
import org.junit.Assert;
import net.thucydides.core.annotations.Step;

public class NewWindowsSearchSteps {

	public AutomationTestingPracticePage automationTestingPractice;

	@Step
	public void amIOnTheNewWindowSearchPage() {
		Assert.assertTrue(automationTestingPractice.amIOnTheNewWindowSearchPage());
	}

	@Step
	public void enterSearchText(String searchText) {
		automationTestingPractice.enterTextInNewWindowsSearchBox(searchText);		
	}

	@Step
	public void clickSubmitButton() {
		automationTestingPractice.clickNewWindowsSearchBoxPresentSubmitButton();		
	}

	public void areSearchResultsVisible() {
		Assert.assertTrue(automationTestingPractice.areSeachResultsPresent());
	}

	public void isMoreSearchResultsVisible() {
		Assert.assertTrue(automationTestingPractice.isMoreSeachResultsPresent());
	}
}