Feature: WordPress Website Automation

  Scenario: Verify WordPress website functionalities
    Given User launches WordPress website
    Then Verify the page title
    When User clicks on Download and Get WordPress
    Then Verify middle text as "Get WordPress"
    When User clicks Community and Photo Directory
    And User searches for "nature"
    Then Verify pictures are displayed