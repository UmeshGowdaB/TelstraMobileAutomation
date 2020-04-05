Feature: search and checkout items on amazon

  Scenario Outline: Search for a item and checkout
    Given I login into amazon app
    When I search for <item>
    And I Add the <item> to cart
    Then I can checkout the <item> selected

    Examples:
    | item           |
    | 65 inch Tv     |