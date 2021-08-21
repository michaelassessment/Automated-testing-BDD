Feature: Volunteer Sign Up
@test
Scenario Outline: Validate page layout
	Given I am on the Volunteer Sign Up Page
	Then the form fields <Field 1>, <Field 2>, <Field 3>, <Field 4>, <Field 5>, <Field 6>, <Field 7>, <Field 8>, <Field 9> are present
	And the upload file section is present
	And the submit button is present
	
Examples:
|Field 1   |Field 2  |Field 3|Field 4|Field 5|Field 6      |Field 7|Field 8                                             |Field 9    	     |
|First Name|Last Name|Phone  |Country|City   |Email Address|Gender |What days of the week are you consistently available|Best Time to Contact|

@test
Scenario Outline: Populate and Submit form
	Given I am on the Volunteer Sign Up Page
	When I populate <Field 1>, <Field 2>, <Field 3>, <Field 4>, <Field 5>, <Field 6> with <Value 1>, <Value 2>, <Value 3>, <Value 4>, <Value 5>, <Value 6>
	And I choose the Gender <Gender>
	And I select the Day <Day>
	And I upload the <file>
	Then the form was submitted successfully
	
Examples:
|Field 1   |Field 2  |Field 3|Field 4|Field 5|Field 6      |Value 1|Value 2|Value 3    |Value 4|Value 5|Value 6      |Gender|Day     |file|
|First Name|Last Name|Phone  |Country|City   |Email Address|James  |Smith  |07598492384|UK     |Horsham|james@bmc.com|Male  |Saturday|NewWindowsSearch.feature|