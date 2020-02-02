Feature: Register account
  Scenario Outline:
    Given user navigates to "<url>"
    When user clicks on the Zarejestruj sie button
    And user enters the email "<iadres>"
    And user enters the first name "<imie>"
    And user enters the last name "<nazwisko>"
    And user enters the password "<haslo>"
    And user confirm password "<haslo>"
    And user enters the city "<miasto>"
    And user enters the postcode "<kod>"
    And user enters the street "<ulica>"
    And user enters the flat "<numerd>"
    And user accept rules
    And user clicks Zarejestruj button
    Then user sees confirm page "<url2>"


    Examples:
      |url                                |iadres       |imie |nazwisko |haslo   |miasto   |kod   |ulica |numerd|url2                                           |
      |https://tester.codersguru.pl/login |olo9@o2.pl   |Olo  |Bolo     |ZuluGula|Wloclawek|87-800|Polna |71A   |https://tester.codersguru.pl/register/confirmed|
      |https://tester.codersguru.pl/login |romkost2@o2.pl|Roman|Kostuniak|123qwe  |Wloclawek|87-800|Zytnia|71A   |https://tester.codersguru.pl/register/confirmed|

  #//Z wykorzystaniem Cucumber przygotuj test, który będzie zakładał konto na stronie
  #// https://tester.codersguru.pl/login
  #// https://www.mcdonalds.com/us/en-us/subscription.html#signin - to dla orlow

