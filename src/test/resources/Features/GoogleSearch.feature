Feature: The file includes feature to test the google search functionality

  @GoogleSearchTests
  Scenario: User search for share prices
  Given Browser is open
  And user is on Google search page
  When user enters a text in google search box
  And hits the enter
  Then many results are displayed
