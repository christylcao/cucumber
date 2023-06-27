@LoginWithDB
Feature: Techfio billing login page functionality validation



@LoginScenario1
	Scenario: User should be able to login with valid credentials
		Given User is on the techfios login page
		When User inputs "username" from mysql database
		When User inputs "password" from mysql database
		When User clicks on sign in button
		Then User will be on dashboard page
