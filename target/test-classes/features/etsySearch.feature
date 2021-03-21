
Feature: Etsy search feature

Scenario: Etsy default Title Verification
Given   User is on the Etsy landing page
When User sees title is as expected.
#Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
#Note: Follow POM

  @Etsy
  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given User is on the Etsy landing page
When User types "wooden spoon" in the search box
    Then User sees "Wooden spoon" is in the title