@SignInFeature @Order(3)
Feature: Signing In

  @Signin
  Scenario Outline: SigningIn portal
    #Given The user opens Home Page
    When The user clicks "Sign in"
    Then The user land on Login Page
    When The user clicks "Login" button with all fields empty
    Then It should display an error "Please fill out this field" below Username textbox
    When The user clicks "Login" button with "<InvalidUsername>" Username and password fields empty
    Then It should display an error "Please fill out this field" below Password textbox
    When The user clicks "Login" button after entering "<InvalidUsername>" and "<InvalidPassword>" in username and password fields
    Then It should display an error message "Invalid Username and Password"
    When The user clicks "Login" button after entering ValidUsername and ValidPassword in username and password fields
    Then It should redirected to homepage.
    When The user clicks "Sign out"

    Examples: 
      | InvalidUsername | InvalidPassword |
      | @#dsal          | ds@qw           |
