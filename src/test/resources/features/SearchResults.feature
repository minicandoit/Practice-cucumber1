Feature: files for Task5

  @searchResults
  Scenario: Table columns names  As a user, I should be able to login as librarian. When I go to Users page, table
  should have following columns:
    Given user is on the login page
    And user login as a librarian
    And I click on "Users" link
    Then table should have following column names:
      | Actions |
      | User ID |
      | Full Name |
      | Email |
      | Group |
      | Status|