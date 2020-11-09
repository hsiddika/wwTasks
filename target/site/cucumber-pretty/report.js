$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Features/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Weight Watchers Test Cases",
  "description": "",
  "id": "weight-watchers-test-cases",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify Page Title match",
  "description": "",
  "id": "weight-watchers-test-cases;verify-page-title-match",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify Page Title",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 8
    }
  ],
  "location": "StepDefinition.launch_url(String)"
});
formatter.result({
  "duration": 15793575600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_Page_Title()"
});
formatter.result({
  "duration": 34394900,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify Page Title Find a Workshop",
  "description": "",
  "id": "weight-watchers-test-cases;verify-page-title-find-a-workshop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Launch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Click on find a workshop",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Verify title of Workshop page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 8
    }
  ],
  "location": "StepDefinition.launch_url(String)"
});
formatter.result({
  "duration": 12655651800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_find_a_workshop()"
});
formatter.result({
  "duration": 8911085800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_title_of_Workshop_page()"
});
formatter.result({
  "duration": 37159500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify workshop zipcode search",
  "description": "",
  "id": "weight-watchers-test-cases;verify-workshop-zipcode-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Launch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Click on find a workshop",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Type zipcode search field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on search",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Verify title of first search",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 8
    }
  ],
  "location": "StepDefinition.launch_url(String)"
});
formatter.result({
  "duration": 5334262600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_find_a_workshop()"
});
formatter.result({
  "duration": 2543103100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.type_zipcode_search_field()"
});
formatter.result({
  "duration": 8733129400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_search()"
});
formatter.result({
  "duration": 264343700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_title_of_first_search()"
});
formatter.result({
  "duration": 2592178400,
  "status": "passed"
});
});