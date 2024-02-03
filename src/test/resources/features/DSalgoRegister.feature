@RegisterFeature @Order(2)
Feature: DSalgo Registeration


	@Register
  Scenario Outline: Register DSalgo portal
   
    When The user clicks "Register"
    When The user clicks "Register" button with all fields empty
    Then It should display an error "Please fill out this field" below Username textbox
    When The user clicks "Register" button after entering Username with other fields empty
    Then It should display an error "Please fill out this field" below Password textbox
    When The user clicks "Register" button after entering Username and password with Password Confirmation field empty
    Then It should display an error "Please fill out this field" below Password Confirmation textbox
    When The user clicks "Register" button after entering "<InvalidUsername>" and "<InvalidPassword>" in text fields
    Then It should display an error message "Please enter a valid username and Password"
    When The user clicks "Register" button after entering "<ValidUsername>" "<ValidPassword>" in username and password field and different password in Password Confirmation fields
    Then It should display an error message "password_mismatch:The two password fields didn’t match."
    When The user clicks "Register" button after entering "<ValidUsername>" and "<ValidPassword>" in text fields

    #Then It should redirected to homepage.
    Examples: 
      | InvalidUsername | InvalidPassword | ValidUsername | ValidPassword |
      | @#dsal          | ds@qw           | Group1@dslgo  | dsalgo2024    |

  