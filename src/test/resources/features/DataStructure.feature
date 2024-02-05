@DataStructure @Order(4)
Feature: DataStructure

  @DSFlow1
  Scenario: DataStructure Flow - Time Complexity
    Given The user is in the Home page after logged in
    When The user clicks on Get Started button
    Then The user should be directed to "DataStructure" Page
    When The user clicks "Time Complexity" link
    Then The user should be directed to "Time Complexity" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters Wrong Python code in the tryEditor and clicks on Run button
    Then It throws an Alert
    When The user enters Valid Python code in the tryEditor and clicks on Run button
    Then The Output displays in Console
    When The user clicks on the "Sign out"

  @DSFlow2
  Scenario: DataStructure Flow - DS Practice
    Given The user is in the Home page after logged in
    When The user clicks on Get Started button
    Then The user should be directed to "DataStructure" Page
    When The user clicks "Time Complexity" link
    Then The user should be directed to "Time Complexity" Page
    When The user clicks DS Practice Questions link
    Then The user should be redirected to "Practice" page
    When The user clicks on the "Sign out"
