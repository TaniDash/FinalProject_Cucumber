@Regression
Feature: Techfios test webpage background color functionality  validation

@Test1
Scenario: User should be able change and validate Sky Blue Background

Given "Set SkyBlue Background" button exists
When User clicks on the Set Sky Blue Background button
Then The background color will change to sky blue

@Test2
Scenario: User should be able change and validate White Background

Given "Set White Background" button exists
When User should be able to click on the button
Then The background color will change to white