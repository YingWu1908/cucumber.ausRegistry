Feature: Check registrar web sites 

Scenario:Successful Check registrar web sites 
	Given I am on the ausregister home page
	When Using the dynamic panel with icons located on the right‐hand side
	Then Counting a number of external http links to the registrar web sites in “Find your domain” section
	Then “Learn more” button located below “Find your domain” section
	Then Verifying “Become a Registrar” page was displayed
	Then Verifying the main text section on the page contains email and phone number
#    Then Closed the browser