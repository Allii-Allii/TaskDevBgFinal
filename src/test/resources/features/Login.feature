Feature: Login Functionality

  Scenario Outline: Successful login with different user credentials
    Given remove cookies
    Given the user click Enter button
    Given the user set username "<username>"
    Given the user set password "<password>"
    When the user click Login Button
    Then get error massage is "<message>"


    Examples:
      | username      | password     | message                 |
      | standard_user | secret_sauce | Грешни имейл или парола |
      | standard_user | secret_sauce | Грешни имейл |

