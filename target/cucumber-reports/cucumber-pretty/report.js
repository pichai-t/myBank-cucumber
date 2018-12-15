$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myHomeLoan.feature");
formatter.feature({
  "line": 1,
  "name": "myHomeLoan01",
  "description": "",
  "id": "myhomeloan01",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "myHomeLoanA1",
  "description": "",
  "id": "myhomeloan01;myhomeloana1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Test Scenario is \"myHomeLoan-01\"",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "# Verify Down payment percentage"
    }
  ],
  "line": 8,
  "name": "I open \"https://www.zillow.com/mortgage-calculator/\" in \"Google Chrome\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter \"Home price\" field as \"400000\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter \"Down payment\" field as \"80000\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I see \"Percentage of Down payment\" as \"20\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "myHomeLoan-01",
      "offset": 18
    }
  ],
  "location": "GivenSteps.testScenarioIs(String)"
});
formatter.result({
  "duration": 1105036042,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.zillow.com/mortgage-calculator/",
      "offset": 8
    },
    {
      "val": "Google Chrome",
      "offset": 57
    }
  ],
  "location": "WhenSteps.iOpenIn(String,String)"
});
formatter.result({
  "duration": 36268301901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home price",
      "offset": 9
    },
    {
      "val": "400000",
      "offset": 31
    }
  ],
  "location": "WhenSteps.iEnterFieldAs(String,String)"
});
formatter.result({
  "duration": 1161354018,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Down payment",
      "offset": 9
    },
    {
      "val": "80000",
      "offset": 33
    }
  ],
  "location": "WhenSteps.iEnterFieldAs(String,String)"
});
formatter.result({
  "duration": 1828696101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Percentage of Down payment",
      "offset": 7
    },
    {
      "val": "20",
      "offset": 39
    }
  ],
  "location": "ThenSteps.iSeeAs(String,String)"
});
formatter.result({
  "duration": 152221499,
  "status": "passed"
});
});