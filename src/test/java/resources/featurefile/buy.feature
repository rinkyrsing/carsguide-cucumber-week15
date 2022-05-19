Feature: Search functionality
  As a user I want to browse into cars guide website

  @smoke @regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When  I mouse hover on “buy+sell” tab
    And   I click ‘Search Cars’ link
    Then  I navigate to ‘new and used car search’ page
    And   I select make "<make>"
    And   I select model "<model>"
    And   I select location "<location>"
    And   I select price "<price>"
    And   I click on Find My Next Car tab
    Then  I should see the make "<make>" in results
    Examples:
      | make          | model           | location              | price    |
      | Tesla         | Model 3         | NSW - All             | $150,000 |
      | Audi          | A1              | NSW - All             | $100,000 |
      | Land Rover    | Discovery Sport | NSW - Central West    | $80,000  |
      | Mercedes-Benz | A-Class         | NSW - Far North Coast | $70,000  |
      | Bentley       | Flying Spur     | NSW - Hunter          | $90,000  |
      | Tata          | Xenon           | NSW - Illawarra       | $10,000  |
#
#  @regression
#  Scenario Outline: Search the used car with model
#    Given I am on homepage
#    When I mouse hover on “buy+sell” tab
#    And I click ‘Used’ link
#    Then I navigate to ‘Used Cars For Sale’ page
#    And I select make "<make>"
#    And I select model "<model>"
#    And I select location "<location>"
#    And I select price "<price>"
#    And I click on Find My Next Car tab
#    Then I should see the make "<make>" in results
#    Examples:
#      | make          | model             | location            | price    |
#      | Land Rover    | Range Rover Sport | QLD - Brisbane      | $100,000 |
#      | Kia           | Picanto           | NSW - Sydney        | $90,000  |
#      | Mercedes-Benz | A-Class           | NSW - All           | $150,000 |
#      | Ford          | Focus             | NSW - New England   | $70,000  |
#      | Hyundai       | Elantra           | NT - North          | $80,000  |
#      | Honda         | City              | NSW - Central Coast | $90,000  |



