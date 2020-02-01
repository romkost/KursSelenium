Feature: Change address information after login
  Scenario: Change address
    Given User log in
    When User goes to UserAddressPage
    And User write zip "87-800" city "Wloclawek" and street "Żytnia 71A"
    And User click save
    Then User sees message "Address successfully added!"