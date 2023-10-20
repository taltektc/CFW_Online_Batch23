Feature: SauceDemo

  @regression @sd
  Scenario: User able to login with valid credentials in SauceDemo
    Given I am at SauceDemo Homepage
    And I enter my valid username at SauceDemo
    And I enter my valid password at SauceDemo
    When I click on Login Button at SauceDemo
    Then I should be able to successfully login at SauceDemo

  @regression @sd
  Scenario: Failing test on purpose
    Given Verify logo name for SauceDemo



