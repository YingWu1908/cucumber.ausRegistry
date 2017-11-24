Feature: Check About AuDomain Page

@about
Scenario:Successful Check about registry page
	Given I am on the ausregister home page
	When Navigate to about AuDomain page from menu on the top
	Then Verifying "a .au domain name" was displayed