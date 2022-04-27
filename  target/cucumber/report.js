$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BackgroundColorFEature.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios test webpage background color functionality  validation",
  "description": "",
  "id": "techfios-test-webpage-background-color-functionality--validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 2291535900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able change and validate Sky Blue Background",
  "description": "",
  "id": "techfios-test-webpage-background-color-functionality--validation;user-should-be-able-change-and-validate-sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "\"Set SkyBlue Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the Set Sky Blue Background button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "BackgorundColorStepDefinition.button_exists(String)"
});
formatter.result({
  "duration": 723543100,
  "status": "passed"
});
formatter.match({
  "location": "BackgorundColorStepDefinition.user_clicks_on_the_Set_Sky_Blue_Background_button()"
});
formatter.result({
  "duration": 3067713300,
  "status": "passed"
});
formatter.match({
  "location": "BackgorundColorStepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 367095300,
  "status": "passed"
});
formatter.before({
  "duration": 1363102900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should be able change and validate White Background",
  "description": "",
  "id": "techfios-test-webpage-background-color-functionality--validation;user-should-be-able-change-and-validate-white-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "\"Set White Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User should be able to click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "The background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set White Background",
      "offset": 1
    }
  ],
  "location": "BackgorundColorStepDefinition.button_exists(String)"
});
formatter.result({
  "duration": 742262300,
  "status": "passed"
});
formatter.match({
  "location": "BackgorundColorStepDefinition.user_should_be_able_to_click_on_the_button()"
});
formatter.result({
  "duration": 3088262100,
  "status": "passed"
});
formatter.match({
  "location": "BackgorundColorStepDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 334892100,
  "status": "passed"
});
});