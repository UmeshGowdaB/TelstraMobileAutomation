Feature: search and checkout items on amazon

  Scenario: Search for a item and checkout
    Given I logged into amazon app
    When I search for item
    And I Add the item to cart
    Then I can checkout the item selected