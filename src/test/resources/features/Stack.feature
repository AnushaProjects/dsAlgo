@Stack
Feature: Stack

  @StackFlow1
  Scenario: Stack Flow - Operations in Stack
    Given The user is in the Home page after logged in
    When The user clicks on Stack Get Started button
    Then The user should be directed to "Stack" Page
    When The user clicks "Operations in Stack" link
    Then The user should be directed to "Operations in Stack" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters Wrong Python code in the tryEditor and clicks on Run button
    Then It throws an Alert
    When The user enters Valid Python code in the tryEditor and clicks on Run button
    Then The Output displays in Console

  @StackFlow2
  Scenario: Stack Flow - Implementation
    Given The user is in the Home page after logged in
    When The user clicks on Stack Get Started button
    Then The user should be directed to "Stack" Page
    When The user clicks "Implementation" link
    Then The user should be directed to "Implementation" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters Wrong Python code in the tryEditor and clicks on Run button
    Then It throws an Alert
    When The user enters Valid Python code in the tryEditor and clicks on Run button
    Then The Output displays in Console

  @StackFlow3
  Scenario: Stack Flow - Applications
    Given The user is in the Home page after logged in
    When The user clicks on Stack Get Started button
    Then The user should be directed to "Stack" Page
    When The user clicks "Applications" link
    Then The user should be directed to "Applications" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters Wrong Python code in the tryEditor and clicks on Run button
    Then It throws an Alert
    When The user enters Valid Python code in the tryEditor and clicks on Run button
    Then The Output displays in Console

  @StackFlow4
  Scenario: Stack Flow - Applications Practice
    Given The user is in the Home page after logged in
    When The user clicks on Stack Get Started button
    Then The user should be directed to "Stack" Page
    When The user clicks "Applications" link
    Then The user should be directed to "Applications" Page
    When The user clicks Stack Practice Questions link
    Then The user should be redirected to "Practice" page
