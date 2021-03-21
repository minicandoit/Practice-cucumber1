@wiki
Feature: wiki search feature

  Scenario: Wikipedia Search Functionality Title Verification
  When User is on Wikipedia home page
  And User types "Steve Jobs" in the wiki search box
  Then User sees "Steve Jobs" is in the wiki title
  #Note: Follow POM

 Scenario: Wikipedia Search Functionality Header Verification
 When User is on Wikipedia home page
And User types "Steve Jobs" in the wiki search box
  Then User sees "Steve Jobs" is in the main header
 #Note: Follow POM

 Scenario: Wikipedia Search Functionality Image Header Verification
 When User is on Wikipedia home page
 And User types "Steve Jobs" in the wiki search box

 Then User sees Steve Jobs is in the image header
 #Note: Follow POM