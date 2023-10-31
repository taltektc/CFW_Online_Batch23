Feature: SauceDemo

  Background:
    Given I am at SauceDemo Homepage

  @regression @sd
  Scenario: User able to login with valid credentials in SauceDemo
    And I enter my valid username at SauceDemo
    And I enter my valid password at SauceDemo
    When I click on Login Button at SauceDemo
    Then I should be able to successfully login at SauceDemo

  @regression @sd
  Scenario: Failing test on purpose
    And I enter my valid username at SauceDemo

  @sd
  Scenario: User able to login with valid credentials in SauceDemo
    And I enter my invalid username at SauceDemo
    And I enter my valid password at SauceDemo
    When I click on Login Button at SauceDemo
    Then I should not be able to successfully login at SauceDemo

  @dataDriven @dd
  Scenario Outline: Testing Data driven
    And I enter my valid "<UserName>" and "<Password>" at SauceDemo
    When I click on Login Button at SauceDemo
    Then I should be able to successfully login at SauceDemo
    Examples:
      |UserName|Password|
      |standard_user|secret_sauce|
      |locked_out_user|secret_sauce|
      |problem_user|secret_sauce|
      |performance_glitch_user|secret_sauce|
      |error_user|secret_sauce|
      |visual_user|secret_sauce|

