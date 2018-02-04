$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DomainTabs.feature");
formatter.feature({
  "line": 1,
  "name": "As a user, I want to perform click operations on Domain website",
  "description": "",
  "id": "as-a-user,-i-want-to-perform-click-operations-on-domain-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Click different tabs on Domain Home page",
  "description": "",
  "id": "as-a-user,-i-want-to-perform-click-operations-on-domain-website;click-different-tabs-on-domain-home-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on Domain home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the tab \u003ctabName\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the target tab-page \u003ctabName\u003e and section title \u003csectionTitle\u003e and \u003cpageTitle\u003e is displayed successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "as-a-user,-i-want-to-perform-click-operations-on-domain-website;click-different-tabs-on-domain-home-page;",
  "rows": [
    {
      "cells": [
        "tabName",
        "sectionTitle",
        "pageTitle"
      ],
      "line": 9,
      "id": "as-a-user,-i-want-to-perform-click-operations-on-domain-website;click-different-tabs-on-domain-home-page;;1"
    },
    {
      "cells": [
        "Rent",
        "Find your perfect home",
        "Rent Houses, Apartments, Units, Flats and New Developments"
      ],
      "line": 10,
      "id": "as-a-user,-i-want-to-perform-click-operations-on-domain-website;click-different-tabs-on-domain-home-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Click different tabs on Domain Home page",
  "description": "",
  "id": "as-a-user,-i-want-to-perform-click-operations-on-domain-website;click-different-tabs-on-domain-home-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on Domain home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the tab Rent",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the target tab-page Rent and section title Find your perfect home and Rent Houses, Apartments, Units, Flats and New Developments is displayed successfully",
  "matchedColumns": [
    0,
    1,
    2
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
});