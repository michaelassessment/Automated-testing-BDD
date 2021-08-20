Feature: Volunteer Sign Up
@test4
Scenario Outline: Validate page layout
	Given I am on the Volunteer Sign Up Page
	Then the form fields <Field 1>, <Field 2>, <Field 3>, <Field 4>, <Field 5>, <Field 6>, <Field 7>, <Field 8>, <Field 9>, <Field 10>, are present
	And the submit button is present
	
Examples:
|Field 1   |Field 2  |Field 3|Field 4|Field 5|Field 6      |Field 7|Field 8                                             |Field 9    	     |Field 10    |
|First Name|Last Name|Phone  |Country|City   |Email Address|Gender |What days of the week are you consistently available|Best Time to Contact|Upload Files|

@test4
Scenario Outline: Populate and Submit form
	Given I am on the Volunteer Sign Up Page
	When I populate <Field 1>, <Field 2>, <Field 3>, <Field 4>, <Field 5>, <Field 6> with <Value 1>, <Value 2>, <Value 3>, <Value 4>, <Value 5>, <Value 6>
	And I choose the Gender
	And I select the Day
	And I upload the <file>
	And I click the submit button
	Then the form was submitted successfully
	
Examples:
|Field 1   |Field 2  |Field 3|Field 4|Field 5|Field 6      |Field 7|Field 8                                             |Field 9    	     |Field 10    |Value 1|Value 2|Value 3    |Value 4|Value 5|Value 6      |Gender|Day     |file|
|First Name|Last Name|Phone  |Country|City   |Email Address|Gender |What days of the week are you consistently available|Best Time to Contact|Upload Files|James  |Smith  |07598492384|UK     |Horsham|james@bmc.com|Male  |Saturday|NewWindowsSearch.feature|