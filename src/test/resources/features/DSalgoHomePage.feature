@HomePageFeature @Order(1)
Feature: Home Page

	@exclude
  @Homepage
  Scenario: Home Page
    Given The user opens Home Page
    When The user clicks "Data Structures" drop down
    Then I shouls see 6 different data structure entries in that dropdown
    Then The user clicks any of the "Get Started" buttons below the data structures
    Then It should alert the user with a message "You are not logged in"
    When The user selects any data structures item from the drop down without Sign in.
    Then It should alert the user with a message "You are not logged in"
    When The user clicks "Register"
    Then The user should be redirected to Register form
