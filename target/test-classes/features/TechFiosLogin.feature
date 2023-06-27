@LoginFeature @Regression
Feature: Techfio billing login page functionality validation

Background:
		Given User is on the techfios login page
		When User inputs username as "demo@techfios.com"

@LoginScenario1
	Scenario: User should be able to login with valid credentials
		When User inputs password as "abc123"
		When User clicks on sign in button
		Then User will be on dashboard page

@LoginScenario2 
	Scenario: User should be able to login with valid credentials
		When User inputs password as "abc1234"
		When User clicks on sign in button
		Then User will be on dashboard page