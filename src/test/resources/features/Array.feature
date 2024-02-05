@Array
Feature: Array

  @ArrayFlow1
  Scenario: Array Flow - Arrays in Python
    Given The user is in the Home page after logged in
    When The user clicks on Array Get Started button
    Then The user should be directed to "Array" Page
    When The user clicks "Arrays in Python" link
    Then The user should be directed to "Arrays in Python" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters Wrong Python code in the tryEditor and clicks on Run button
    Then It throws an Alert
    When The user enters Valid Python code in the tryEditor and clicks on Run button
    Then The Output displays in Console
    When The user clicks on the "Sign out"

  @ArrayFlow2
  Scenario: Array Flow - Arrays Using List
    Given The user is in the Home page after logged in
    When The user clicks on Array Get Started button
    Then The user should be directed to "Array" Page
    When The user clicks "Arrays Using List" link
    Then The user should be directed to "Arrays Using List" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters Wrong Python code in the tryEditor and clicks on Run button
    Then It throws an Alert
    When The user enters Valid Python code in the tryEditor and clicks on Run button
    Then The Output displays in Console
    When The user clicks on the "Sign out"

  @ArrayFlow3
  Scenario: Array Flow - Basic Operations in Lists
    Given The user is in the Home page after logged in
    When The user clicks on Array Get Started button
    Then The user should be directed to "Array" Page
    When The user clicks "Basic Operations in Lists" link
    Then The user should be directed to "Basic Operations in Lists" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters Wrong Python code in the tryEditor and clicks on Run button
    Then It throws an Alert
    When The user enters Valid Python code in the tryEditor and clicks on Run button
    Then The Output displays in Console
    When The user clicks on the "Sign out"

  @ArrayFlow4
  Scenario: Array Flow - Applications of Array
    Given The user is in the Home page after logged in
    When The user clicks on Array Get Started button
    Then The user should be directed to "Array" Page
    When The user clicks "Applications of Array" link
    Then The user should be directed to "Applications of Array" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters Wrong Python code in the tryEditor and clicks on Run button
    Then It throws an Alert
    When The user enters Valid Python code in the tryEditor and clicks on Run button
    Then The Output displays in Console
    When The user clicks on the "Sign out"

  @ArrayFlow5
  Scenario: Array Flow - Array Practice
    Given The user is in the Home page after logged in
    When The user clicks on Array Get Started button
    Then The user should be directed to "Array" Page
    When The user clicks "Applications of Array" link
    Then The user should be directed to "Applications of Array" Page
    When The user clicks Array Practice Questions link
    Then The user should be redirected to "Practice" page
    When The could see the number of links to practice
    When The User clicks on each links to Practice the code in tryEditor with a Submit button to test
    When The user clicks on the "Sign out"
    
