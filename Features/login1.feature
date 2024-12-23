Feature: user login

  Scenario Outline: Sucessful login
    Given the user is on the amazon login page
    When the user enters valid credential1"<Username>"
    And the user click continue button
    When the user enters valid credential"<Password>"
    Then the user click on login button
    And the user should see company log
   
    Examples:
    | Username | Password |
    | 8095160964 |Vishant@8095 |