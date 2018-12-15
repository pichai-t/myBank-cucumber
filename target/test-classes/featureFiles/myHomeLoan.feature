Feature: myHomeLoan01

Scenario: myHomeLoanA1

  Given Test Scenario is "myHomeLoan-01"

    # Verify Down payment percentage
    When I open "https://www.zillow.com/mortgage-calculator/" in "Google Chrome"

    When I enter "Home price" field as "400000"
    And I enter "Down payment" field as "80000"

    Then I see "Percentage of Down payment" as "20"

