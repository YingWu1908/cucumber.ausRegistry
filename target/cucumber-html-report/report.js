$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AboutRegistry.feature");
formatter.feature({
  "line": 1,
  "name": "Check About Registry Page",
  "description": "",
  "id": "check-about-registry-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful Check about registry page",
  "description": "",
  "id": "check-about-registry-page;successful-check-about-registry-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@about"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the ausregister home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to about ausregistry page from menu on the top",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Verifying \"a .au domain name\" was displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageDefinition.I_am_on_the_ausregister_Home_Page()"
});
formatter.result({
  "duration": 6439706978,
  "status": "passed"
});
formatter.match({
  "location": "AboutRegistry.navigate_to_about_ausregistry_page_from_menu_on_the_top()"
});
formatter.result({
  "duration": 6561850646,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a .au domain name",
      "offset": 11
    }
  ],
  "location": "AboutRegistry.verifying_was_displayed(String)"
});
formatter.result({
  "duration": 42797547,
  "status": "passed"
});
});