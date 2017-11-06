Feature: Check Availability page using the dynamic panel

Scenario Outline:Successful Checking availability page using the dynamic panel
	Given I am on the ausregister home page
	When Using the dynamic panel with icons located on the right‐hand side of the screen
	Then Checking Avilability page was displayed
	Then Using search box in the middle of the page
	Then Perform availability check of the <domainname> with relevant <value>
	Then Validate the <results>
	
	Examples:
	| domainname      | value   | results    | 
  | test-automation | com.au  | Sorry	     |
  | test‐automation | org.au  | Great news |