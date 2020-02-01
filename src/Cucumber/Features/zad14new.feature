Feature: Zakladanie konta
  Scenario Outline:
    Given an open browser with https://tester.codersguru.pl/login
    When a keyword <iadres>is entered in input fieldadres> is entered in input field
    When a keyword <imie> is entered in input field
    When a keyword <nazwisko> is entered in input field
    When a keyword <haslo> is entered in input field
    When a keyword <kod> is entered in input field
    When a keyword <ulica> is entered in input field
    When a keyword <numerd> is entered in input field
    Examples:
      |iadres       |imie |nazwisko |haslo    |kod                        |ulica    |numerd |
      |olek@lolek.pl|Olo  |Bolo     |ZuluGula |[0-1][0-2]-[0-2][0-5][0-2] |Cystersow|14     |