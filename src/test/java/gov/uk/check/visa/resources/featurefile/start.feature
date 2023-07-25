@Regression
Feature: VisaCheck Test

  @smoke
  Scenario:anAustralianComingToUKForTourism
    Given I click on start button
    When  I Select a Nationality "Australia"
    And I click on Continue button
    And I Select reason "Tourism or visiting family and friends"
    And I lick on Continue button
    Then I should see the text message "You will not need a visa to come to the UK"

  @Sanity
  Scenario: aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths
    Given I click on start button
    When I Select a Nationality "Chile"
    And I click on Continue button
    And I Select reason "Work, academic visit or business"
    And I click on Continue button
    And I select intended to stay for "longer than 6 months"
    And I click on Continue button
    And I select have planning to work for "Health and care professional"
    And I click on Continue button
    Then I should see the text message  "You need a visa to work in health and care"


  Scenario: aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card
    Given  I click on start button
    When I Select a Nationality "Colombia"
    And I click on Continue button
    And I Select reason "Join partner or family for a long stay"
    And I click on Continue button
    And I select state My partner of family member have uk immigration status "yes"
    And I click on Continue button
    Then I should able to see the text message "You’ll need a visa to join your family or partner in the U"


