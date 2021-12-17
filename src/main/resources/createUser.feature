Feature:
  As new user I will try to register on site.

  Scenario Outline: Access to button register
    Given User opens '<homePage>' page
    And User click on ok button
    When User click on User button
    When User fill in all registration fields valid data
    Then User click on button registration
    And Check the massage



    Examples:
      | homePage                          |
      | https://local-goods-b2d19.web.app |

