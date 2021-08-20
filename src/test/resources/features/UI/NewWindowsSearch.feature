Feature: New Windows Search
@test4
Scenario: Validate page layout
	Given I am on the New Windows Search Page
	Then the new windows search input is present
	And the new windows search submit button is present

@test4
Scenario Outline: Perform search
	Given I am on the New Windows Search Page
	When I enter search <text>
	And I click on the submit button
	Then I can see some search results
	And I can see more search results
	
Examples:
|text    |
|Benchmark|