package testing.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.pages.PageObject;


public class AutomationTestingPracticePage extends PageObject {

	@FindBy (className="segment_header")
	private List<WebElement> heading;
	
	@FindBy (className="//*[@class='question left_question_first']")
	private List<WebElement> uploadFileSection;
	
	@FindBy (css="#FSsubmit")
	private List<WebElement> submitButtonList;
	
	@FindBy (css="#FSsubmit")
	private WebElement submitButton;
		
	@FindBy (css="[for='RESULT_RadioButton-7_0']")
	private WebElement maleRadioButton;

	@FindBy (css="[for='RESULT_RadioButton-7_1']")
	private WebElement femaleRadioButton;
	
	@FindBy (css="[for='RESULT_CheckBox-8_0")
	private WebElement sunday;
	
	@FindBy (css="[for='RESULT_CheckBox-8_1)")
	private WebElement monday;
	
	@FindBy (css="[for='RESULT_CheckBox-8_2")
	private WebElement tuesday;
	
	@FindBy (css="[for='RESULT_CheckBox-8_3")
	private WebElement wednesday;
	
	@FindBy (css="[for='RESULT_CheckBox-8_4")
	private WebElement thursday;
	
	@FindBy (css="[for='RESULT_CheckBox-8_5")
	private WebElement friday;
	
	@FindBy (css="[for='RESULT_CheckBox-8_6']")
	private WebElement saturday;
	
	@FindBy (css="#Wikipedia1_wikipedia-search-input")
	private List<WebElement> searchInputList;
	
	@FindBy (css="#Wikipedia1_wikipedia-search-input")
	private WebElement searchInput;
	
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
 	
 	private static final String FILE_UPLOAD_PATH = "C:\\Users\\malpka\\Documents\\Dev\\UI\\src\\test\\resources\\features\\UI\\";
		
	public AutomationTestingPracticePage(WebDriver driver) {
	}

	public boolean amIOnTheVolunteerSignupPage() {
		
		super.getDriver().get(TEST_AUTOMATION_URL);
		
		super.getDriver().switchTo().frame(0);
		if (heading.size() > 0)
			return true;
		else
			return false;
	}
	
	public boolean isFieldPresent(String fieldName) {
		
		List<WebElement> field = new ArrayList<>();

		field = super.getDriver().findElements(By.xpath(String.format("//*[@class='question top_question'][contains(text(), '%s')]", fieldName)));
		
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

		list = super.getDriver().findElements(By.xpath(String.format("//div[@id='content'][contains(text(), '%s')]", successMessage)));
		
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
		if (searchInputList.size() > 0)
			return true;
		else
			return false;
	}
	
	public void enterTextInNewWindowsSearchBox(String searchText) {
		searchInput.clear();
		searchInput.sendKeys(searchText);
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
		uploadFile.sendKeys(FILE_UPLOAD_PATH + fileName);
	}

	public boolean doResultsContainSearchText(String searchText) {
		List<WebElement> evaluatedResults = new ArrayList<>();
		
		searchResults.stream()
        .filter(s -> s.getText().toLowerCase().contains(searchText.toLowerCase()))
        .forEach(s-> evaluatedResults.add(s));
		
		if (evaluatedResults.size() == searchResults.size())
			return true;
		else
			return false;
	}

	public void hitEnterPerformSearch() {
		searchInput.sendKeys(Keys.ENTER);		
	}

	public boolean isUploadFileSectionPresent() {
		if (uploadFileSection.size() > 0)
			return true;
		else
			return false;
	}
}