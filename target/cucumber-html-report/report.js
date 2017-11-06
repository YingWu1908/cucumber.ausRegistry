$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePageVerification.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Home Page",
  "description": "",
  "id": "verify-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Verify registed number is bigger than 3000000",
  "description": "",
  "id": "verify-home-page;successful-verify-registed-number-is-bigger-than-3000000",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "URL of ausregistry homepage on chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Navigate to ausregistry Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Verify the number of registed is bigger than 3000000",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyRegistedNumber.url_of_ausregistry_homepage_on_chrome_browser()"
});
formatter.result({
  "duration": 3050615859,
  "status": "passed"
});
formatter.match({
  "location": "VerifyRegistedNumber.user_Navigate_to_ausregistry_Home_Page()"
});
formatter.result({
  "duration": 2136499270,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3000000",
      "offset": 45
    }
  ],
  "location": "VerifyRegistedNumber.verify_the_number_of_registed_is_bigger_than(int)"
});
formatter.result({
  "duration": 74309575,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Successful Checking availability page using the dynamic panel",
  "description": "",
  "id": "verify-home-page;successful-checking-availability-page-using-the-dynamic-panel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "the dynamic panel with icons located on the right‐hand side of the screen",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User click on the icons of check availability",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Checking Availability page was displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});