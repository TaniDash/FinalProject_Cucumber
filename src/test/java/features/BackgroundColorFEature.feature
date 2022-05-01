@Regression
Feature: Techfios test webpage background color functionality  validation

Background: 
Given Verify Set SkyBlue Background button exists
And Verify  Set White Background button exists

@Test1
Scenario: User should be able change and validate Sky Blue Background

When User clicks on the Set Sky Blue Background button
Then The background color will change to sky blue

@Test2
Scenario: User should be able change and validate White Background

When User clicks on the  Set White Background button
Then The background color will change to white