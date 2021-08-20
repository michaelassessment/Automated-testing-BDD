package testing.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;


public class AutomationTestingPracticePage extends PageObject {

	@FindBy (className="segment_header")
	private List<WebElement> heading;
	
	@FindBy (css="#FSsubmit")
	private List<WebElement> submitButtonList;
	
	@FindBy (css="#FSsubmit")
	private WebElement submitButton;
		
	@FindBy (css="#RESULT_RadioButton-7_0")
	private WebElement maleRadioButton;

	@FindBy (css="#RESULT_RadioButton-7_1")
	private WebElement femaleRadioButton;
	
	@FindBy (css="#RESULT_CheckBox-8_0")
	private WebElement sunday;
	
	@FindBy (css="#RESULT_CheckBox-8_1)")
	private WebElement monday;
	
	@FindBy (css="#RESULT_CheckBox-8_2")
	private WebElement tuesday;
	
	@FindBy (css="#RESULT_CheckBox-8_3")
	private WebElement wednesday;
	
	@FindBy (css="#RESULT_CheckBox-8_4")
	private WebElement thursday;
	
	@FindBy (css="#RESULT_CheckBox-8_5")
	private WebElement friday;
	
	@FindBy (css="#RESULT_CheckBox-8_6")
	private WebElement saturday;
	
	@FindBy (css="#Wikipedia1_wikipedia-search-input")
	private List<WebElement> searchInput;
	
	@FindBy (className="wikipedia-search-button")
	private List<WebElement> submitSearchList;
	
	@FindBy (className="wikipedia-search-button")
	private WebElement submitSearch;
	
	@FindBy (xpath="//h2[@class='title'][contains(text(), 'New Windows')]")
	private List<WebElement> newSearchTitle;
	
	@FindBy (css="#wikipedia-search-result-link")
	private List<WebElement> searchResults;
	
	@FindBy (css="#Wikipedia1_wikipedia-search-more")
	private List<WebElement> searchResultsMore;
	
	@FindBy (css="#RESULT_FileUpload-10")
	private WebElement uploadFile;
	
	private static final String TEST_AUTOMATION_URL = "https://testautomationpractice.blogspot.com";
	
	public AutomationTestingPracticePage(WebDriver driver) {
	}

	public boolean amIOnTheVolunteerSignupPage() {
		
		super.getDriver().get(TEST_AUTOMATION_URL);
		
		if (heading.size() > 0)
			return true;
		else
			return false;
	}
	
	public boolean isFieldPresent(String fieldName) {
		
		List<WebElement> field = new ArrayList<>();

		field = super.getDriver().findElements(By.xpath(String.format("//label[@class='question top_question'][contains(text(), '%s')]", fieldName)));
		
		if (field.size() > 0)
			return true;
		else
			return false;
	}
	
	public boolean isSubmitButtonPresent() {		
		
		if (submitButtonList.size() > 0)
			return true;
		else
			return false;
	}

	public void populateField(String fieldName, String fieldValue) {
		WebElement field = super.getDriver().findElement(By.xpath(String.format("//label[@class='question top_question'][contains(text(), '%s')]/following-sibling::input", fieldName)));
		field.clear();
		field.sendKeys(fieldValue);
	}
	
	public void clickGenderMale()
	{
		maleRadioButton.click();
	}
	
	public void clickGenderFemale()
	{
		femaleRadioButton.click();
	}
	
	public void clickDaySunday()
	{
		sunday.click();
	}
	
	public void clickDayMonday()
	{
		monday.click();
	}
	
	public void clickDayTuesday()
	{
		tuesday.click();
	}
	
	public void clickDayWednesday()
	{
		wednesday.click();
	}
	
	public void clickDayThursday()
	{
		thursday.click();
	}
	
	public void clickDayFriday()
	{
		friday.click();
	}
	
	public void clickDaySaturday()
	{
		saturday.click();
	}

	public void clickSubmit() {
		submitButton.click();
	}

	public boolean isFormSubmittedSuccessfully(String successMessage) {
		
		List<WebElement> list = new ArrayList<>();

		list = super.getDriver().findElements(By.xpath(String.format("//div[@id='content'][contains(text(), '%s')])", successMessage)));
		
		if (list.size() > 0)
			return true;
		else
			return false;
	}
	
	public boolean amIOnTheNewWindowsSearchPage() {		
		if (newSearchTitle.size() > 0)
			return true;
		else
			return false;
	}
		
	public boolean isNewWindowsSearchBoxPresent() {		
		if (searchInput.size() > 0)
			return true;
		else
			return false;
	}
	
	public void enterTextInNewWindowsSearchBox(String searchText) {
		searchInput.get(0).clear();
		searchInput.get(0).sendKeys(searchText);
	}
	
	public boolean isNewWindowsSearchBoxSubmitButtonPresent() {		
		if (submitSearchList.size() > 0)
			return true;
		else
			return false;
	}
	
	public void clickNewWindowsSearchBoxPresentSubmitButton() {
		submitSearch.click();
	}	

	public boolean amIOnTheNewWindowSearchPage() {
		super.getDriver().get(TEST_AUTOMATION_URL);
		
		if (newSearchTitle.size() > 0)
			return true;
		else
			return false;
	}
	
	public boolean areSeachResultsPresent()	{		
		if (searchResults.size() > 4)
			return true;
		else
			return false;
	}
	
	public boolean isMoreSeachResultsPresent()	{		
		if (searchResults.size() > 0)
			return true;
		else
			return false;
	}

	public void uploadFile(String fileName) {
		uploadFile.sendKeys("\\src\\test\\resources\\features\\UI\\" + fileName);
	}
}