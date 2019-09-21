$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Test login to application",
  "description": "",
  "id": "test-login-to-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-login-to-application;test-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open browser and navigate to url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.open_browser_and_navigate_to_url()"
});
formatter.result({
  "duration": 17791119000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 2529621300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 7216335900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 895748900,
  "status": "passed"
});
});