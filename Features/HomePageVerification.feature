Feature: Verify registed number is bigger than 3000000 

Scenario:Successful Verify registed number is bigger than 3000000 
	Given I am on the ausregister home page
	When User Navigate to the number of registed
	Then Verify the number of registed is bigger than 3000000
	Then Closed the browser