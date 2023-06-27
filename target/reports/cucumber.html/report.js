$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/LoginWithSQLData.feature");
formatter.feature({
  "name": "Techfio billing login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginWithDB"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginWithDB"
    },
    {
      "name": "@LoginScenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inputs \"username\" from mysql database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_inputs_from_mysql_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inputs \"password\" from mysql database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_inputs_from_mysql_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will be on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_will_be_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
});