$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HorseRace.feature");
formatter.feature({
  "line": 1,
  "name": "As a user, I want to perform betting on William Hill website",
  "description": "",
  "id": "as-a-user,-i-want-to-perform-betting-on-william-hill-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Add stakes to multiple betting types for horse racing",
  "description": "",
  "id": "as-a-user,-i-want-to-perform-betting-on-william-hill-website;add-stakes-to-multiple-betting-types-for-horse-racing",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on William Hill main page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Racing link",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on any available Horse Racking Betting cell",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter \u003cbettingType\u003e and \u003cstake\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on Add to Bet slip button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the added \u003cbettingType\u003e and \u003cstake\u003e displays correctly in the betslip summary area",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "as-a-user,-i-want-to-perform-betting-on-william-hill-website;add-stakes-to-multiple-betting-types-for-horse-racing;",
  "rows": [
    {
      "cells": [
        "bettingType",
        "stake"
      ],
      "line": 12,
      "id": "as-a-user,-i-want-to-perform-betting-on-william-hill-website;add-stakes-to-multiple-betting-types-for-horse-racing;;1"
    },
    {
      "cells": [
        "Quinella",
        "10.5"
      ],
      "line": 13,
      "id": "as-a-user,-i-want-to-perform-betting-on-william-hill-website;add-stakes-to-multiple-betting-types-for-horse-racing;;2"
    },
    {
      "cells": [
        "Exacta",
        "21.5"
      ],
      "line": 14,
      "id": "as-a-user,-i-want-to-perform-betting-on-william-hill-website;add-stakes-to-multiple-betting-types-for-horse-racing;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Add stakes to multiple betting types for horse racing",
  "description": "",
  "id": "as-a-user,-i-want-to-perform-betting-on-william-hill-website;add-stakes-to-multiple-betting-types-for-horse-racing;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on William Hill main page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Racing link",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on any available Horse Racking Betting cell",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter Quinella and 10.5",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on Add to Bet slip button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the added Quinella and 10.5 displays correctly in the betslip summary area",
  "matchedColumns": [
    0,
    1
  ],
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
formatter.scenario({
  "line": 14,
  "name": "Add stakes to multiple betting types for horse racing",
  "description": "",
  "id": "as-a-user,-i-want-to-perform-betting-on-william-hill-website;add-stakes-to-multiple-betting-types-for-horse-racing;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on William Hill main page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Racing link",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on any available Horse Racking Betting cell",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter Exacta and 21.5",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on Add to Bet slip button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the added Exacta and 21.5 displays correctly in the betslip summary area",
  "matchedColumns": [
    0,
    1
  ],
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