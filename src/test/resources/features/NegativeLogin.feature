@NegativeLoginFeature 
Feature: Techfio billing Negative login page functionality validation

Scenario Outline: User should not be able to login with invalid credentials
		Given User is on the techfios login page
		When User inputs username as "<username>"
		When User inputs password as "<password>"
		When User clicks on sign in button
		Then User will be on dashboard page
		
		Examples: 
		|username|password|
		|demo@techfios.com|abc1231|
		|demo2@techfios.com|abc123|
		|demo@techfios.com|abc1234|
		|     |     |
