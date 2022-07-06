@SmokeScenario
Feature: Testing login feature for website -

  @SmokeTest
  Scenario Outline: To test whether user is able to login to website
    Given user is able to access the login page
    When user enters the "<username>" and "<password>"
    And user clicks on the login button
    Then user should be able to navigate to login page
    Examples:
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |