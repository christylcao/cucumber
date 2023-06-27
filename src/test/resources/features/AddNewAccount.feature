Feature: Techfios add new account functionality validation

Background:

		Given User is on the techfios login page
		When User inputs username as "demo@techfios.com"
		When User inputs password as "abc123"
		When User clicks on sign in button
		Then User will be on dashboard page
		
Scenario Outline:

		Then User clicks on Bank and Cash
		Then User clicks on New Account
		And User enters "<account_title>" as account_title on account page
		And User enters "<description>" as description on accounts page 
		And User enters "<balance>" as initial Balance on accounts page  
		And User enters "<account_number>" as account Number on accounts page 
		And User enters "<contact_person>" as contact Person on accounts page 
		And User enters "<contact_number>" as Phone number on accounts page   
		And User enters "<banking_url>" as banking url on accounts page  
		And User clicks on submit
		Then User should be able to validate account created successfully
		
		Examples:
		|account_title|description|balance|account_number|contact_person|contact_number|banking_url|
		|daw syn |new student|2500.00|987654321|emerson t|12346789|https://www.chase.com/|