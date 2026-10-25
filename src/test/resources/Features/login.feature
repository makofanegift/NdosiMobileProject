Feature: Login Feature

Scenario Outline: Successful login with valid credentials
   Given the user is on the login page
   And the user clicks on the login button
   And the user enters the valid username <username>
   And the user enters valid password <password>
   When the user clicks the Submit button
   Then Welcome message should be displayed


  Examples:
    | username | password |
    | user1    | pass1    |
    | user2    | pass2    |

