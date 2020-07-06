Feature: Depop Negative Login Test

Scenario Outline: Depop Incorrect Credential test

	Given user opens browser
	Then user clicks on login link
	Then user enters wrong "<username>" and "<password>"
	Then user clicks on login button
	Then verify error message
	Then close the browser
	
	Examples:
		| username	| password		|
		| keti21	| 1200@Villaa	|