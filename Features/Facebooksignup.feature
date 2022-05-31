Feature: Validate FbSignUp

  Scenario Outline: 
    Given user visits facebook url
    When user enters "<First name>" and"<Last name>" and valid "<email address>" and "<new password>"
    When user select dropdown "<Month>" and dropdown "<Day>" and dropdown "<Year>"
    When user select "<Gender>" 
    And click Sign Up
    And user reconfirm "<email address>" and click Sign Up button again
    Then user will be able to sigup successfully

    Examples: 
      | First name | Last name | email address  | new password | Month | Day | Year |Gender|
      | Jane       | Smith     | test@gmail.com | 8765432|9 |15 | 2000 |Female|