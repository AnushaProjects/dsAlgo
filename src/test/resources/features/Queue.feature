@Queue
Feature: Queue

  @QueueFlow1
  Scenario: Queue Flow - Implementation of Queue in Python
    Given The user is in the Home page after logged in
    When The user clicks on Queue Get Started button
    Then The user should be directed to "Queue" Page
    When The user clicks "Implementation of Queue in Python" link
    Then The user should be directed to "Implementation of Queue in Python" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters Wrong Python code in the tryEditor and clicks on Run button
    Then It throws an Alert
    When The user enters Valid Python code in the tryEditor and clicks on Run button
    Then The Output displays in Console
    When The user clicks on the "Sign out"

  @QueueFlow2
  Scenario: Queue Flow - Implementation using collections.deque
    Given The user is in the Home page after logged in
    When The user clicks on Queue Get Started button
    Then The user should be directed to "Queue" Page
    When The user clicks "Implementation using collections.deque" link
    Then The user should be directed to "Implementation using collections.deque" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters Wrong Python code in the tryEditor and clicks on Run button
    Then It throws an Alert
    When The user enters Valid Python code in the tryEditor and clicks on Run button
    Then The Output displays in Console
    When The user clicks on the "Sign out"

  @QueueFlow3
  Scenario: Queue Flow - Implementation using array
    Given The user is in the Home page after logged in
    When The user clicks on Queue Get Started button
    Then The user should be directed to "Queue" Page
    When The user clicks "Implementation using array" link
    Then The user should be directed to "Implementation using array" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters Wrong Python code in the tryEditor and clicks on Run button
    Then It throws an Alert
    When The user enters Valid Python code in the tryEditor and clicks on Run button
    Then The Output displays in Console
    When The user clicks on the "Sign out"

  @QueueFlow4
  Scenario: Queue Flow - Queue Operations
    Given The user is in the Home page after logged in
    When The user clicks on Queue Get Started button
    Then The user should be directed to "Queue" Page
    When The user clicks "Queue Operations" link
    Then The user should be directed to "Queue Operations" Page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    When The user enters Wrong Python code in the tryEditor and clicks on Run button
    Then It throws an Alert
    When The user enters Valid Python code in the tryEditor and clicks on Run button
    Then The Output displays in Console
    When The user clicks on the "Sign out"

  @QueueFlow5
  Scenario: Queue Flow - Queue Practice
    Given The user is in the Home page after logged in
    When The user clicks on Queue Get Started button
    Then The user should be directed to "Queue" Page
    When The user clicks "Queue Operations" link
    Then The user should be directed to "Queue Operations" Page
    When The user clicks Queue Practice Questions link
    Then The user should be redirected to "Practice" page
    When The user clicks on the "Sign out"
