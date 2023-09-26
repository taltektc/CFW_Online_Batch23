Feature: Login/Sign In

  Scenario: User able to login with valid credentials
    Given I am at TalentTEK Homepage
    And I enter my valid email address
    And I enter my valid password
    When I click on Login Button
    Then I should be able to successfully login

  Scenario: User should not be able to login with invalid email
    Given I am at TalentTEK Homepage
    And I enter my invalid email address
    And I enter my valid password
    When I click on Login Button
    Then I should not be able to successfully login

  Scenario: User should not be able to login with invalid Password
    Given I am at TalentTEK Homepage
    And I enter my valid email address
    And I enter my invalid password
    When I click on Login Button
    Then I should not be able to successfully login

  Scenario: User should not be able to login with invalid credentials
    Given I am at TalentTEK Homepage
    And I enter my invalid email address
    And I enter my invalid password
    When I click on Login Button
    Then I should not be able to successfully login