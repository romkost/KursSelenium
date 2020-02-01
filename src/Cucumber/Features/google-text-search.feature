Feature: Google search
    #Scenario:
     #   Given an open browser with google.com
      #  When a keyword selenium is entered in input field
       # Then the rst one should contain selenium
        #And close browser


    Scenario Outline:
           Given an open browser with google.com
          When a keyword <keyword>is entered in input field
           Then the rst one should contain <expectedText>
         And close browser
        Examples:
            | keyword   | expectedText   |
           | Jacek | Jacek |
           |Karol  | Karol |
