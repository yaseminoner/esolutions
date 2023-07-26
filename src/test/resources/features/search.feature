@smoke
Feature: Searching e.solutions Functionalities
  User Story:
  As a user, I should be able to search on the main page


  Scenario: User should be able to see Software e.solutions and go back to main page
    Given user on the main page
    When user clicks acceptAll cookies
    Then user clicks on softwareEsolutions title
    And user scroll down and up the page
    And user goes back to main page
    Then user should see the title "e.solutions"
