$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CheckAvailabilityPage.feature");
formatter.feature({
  "line": 1,
  "name": "Check Availability page using the dynamic panel",
  "description": "",
  "id": "check-availability-page-using-the-dynamic-panel",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Successful Checking availability page using the dynamic panel",
  "description": "",
  "id": "check-availability-page-using-the-dynamic-panel;successful-checking-availability-page-using-the-dynamic-panel",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on the ausregister home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Using the dynamic panel with icons located on the right‐hand side of the screen",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Checking Avilability page was displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Using search box in the middle of the page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Perform availability check of the \u003cdomainname\u003e with relevant \u003cvalue\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate the \u003cresults\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "check-availability-page-using-the-dynamic-panel;successful-checking-availability-page-using-the-dynamic-panel;",
  "rows": [
    {
      "cells": [
        "domainname",
        "value",
        "results"
      ],
      "line": 12,
      "id": "check-availability-page-using-the-dynamic-panel;successful-checking-availability-page-using-the-dynamic-panel;;1"
    },
    {
      "cells": [
        "test-automation",
        "com.au",
        "Sorry"
      ],
      "line": 13,
      "id": "check-availability-page-using-the-dynamic-panel;successful-checking-availability-page-using-the-dynamic-panel;;2"
    },
    {
      "cells": [
        "test‐automation",
        "org.au",
        "Great news"
      ],
      "line": 14,
      "id": "check-availability-page-using-the-dynamic-panel;successful-checking-availability-page-using-the-dynamic-panel;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Successful Checking availability page using the dynamic panel",
  "description": "",
  "id": "check-availability-page-using-the-dynamic-panel;successful-checking-availability-page-using-the-dynamic-panel;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on the ausregister home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Using the dynamic panel with icons located on the right‐hand side of the screen",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Checking Avilability page was displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Using search box in the middle of the page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Perform availability check of the test-automation with relevant com.au",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate the Sorry",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageDefinition.I_am_on_the_ausregister_Home_Page()"
});
formatter.result({
  "duration": 5289427059,
  "status": "passed"
});
formatter.match({
  "location": "CheckingAvailabilityPage.using_the_dynamic_panel_with_icons_located_on_the_right_hand_side_of_the_screen()"
});
formatter.result({
  "duration": 6649911841,
  "status": "passed"
});
formatter.match({
  "location": "CheckingAvailabilityPage.checking_Avilability_page_was_displayed()"
});
formatter.result({
  "duration": 12684731,
  "status": "passed"
});
formatter.match({
  "location": "CheckingAvailabilityPage.using_search_box_in_the_middle_of_the_page()"
});
formatter.result({
  "duration": 2039076996,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test-automation",
      "offset": 34
    },
    {
      "val": "com.au",
      "offset": 64
    }
  ],
  "location": "CheckingAvailabilityPage.perform_availability_check_of_the_with_relevant(String,String)"
});
formatter.result({
  "duration": 11242676073,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sorry",
      "offset": 13
    }
  ],
  "location": "CheckingAvailabilityPage.validate_the(String)"
});
formatter.result({
  "duration": 3051979156,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Successful Checking availability page using the dynamic panel",
  "description": "",
  "id": "check-availability-page-using-the-dynamic-panel;successful-checking-availability-page-using-the-dynamic-panel;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on the ausregister home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Using the dynamic panel with icons located on the right‐hand side of the screen",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Checking Avilability page was displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Using search box in the middle of the page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Perform availability check of the test‐automation with relevant org.au",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate the Great news",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageDefinition.I_am_on_the_ausregister_Home_Page()"
});
formatter.result({
  "duration": 857415054,
  "status": "passed"
});
formatter.match({
  "location": "CheckingAvailabilityPage.using_the_dynamic_panel_with_icons_located_on_the_right_hand_side_of_the_screen()"
});
formatter.result({
  "duration": 6504969501,
  "status": "passed"
});
formatter.match({
  "location": "CheckingAvailabilityPage.checking_Avilability_page_was_displayed()"
});
formatter.result({
  "duration": 10267948,
  "status": "passed"
});
formatter.match({
  "location": "CheckingAvailabilityPage.using_search_box_in_the_middle_of_the_page()"
});
formatter.result({
  "duration": 2033459171,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test‐automation",
      "offset": 34
    },
    {
      "val": "org.au",
      "offset": 64
    }
  ],
  "location": "CheckingAvailabilityPage.perform_availability_check_of_the_with_relevant(String,String)"
});
formatter.result({
  "duration": 7303941947,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Great news",
      "offset": 13
    }
  ],
  "location": "CheckingAvailabilityPage.validate_the(String)"
});
formatter.result({
  "duration": 3048921636,
  "status": "passed"
});
formatter.uri("HomePageVerification.feature");
formatter.feature({
  "line": 1,
  "name": "Verify registed number is bigger than 3000000",
  "description": "",
  "id": "verify-registed-number-is-bigger-than-3000000",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Verify registed number is bigger than 3000000",
  "description": "",
  "id": "verify-registed-number-is-bigger-than-3000000;successful-verify-registed-number-is-bigger-than-3000000",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the ausregister home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Navigate to the number of registed",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Verify the number of registed is bigger than 3000000",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Closed the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageDefinition.I_am_on_the_ausregister_Home_Page()"
});
formatter.result({
  "duration": 821523593,
  "status": "passed"
});
formatter.match({
  "location": "VerifyRegistedNumber.user_Navigate_to_the_number_of_regiested()"
});
formatter.result({
  "duration": 2006075777,
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
  "duration": 9556605,
  "status": "passed"
});
formatter.match({
  "location": "CommonPageDefinition.closed_the_browser()"
});
formatter.result({
  "duration": 658447953,
  "status": "passed"
});
});