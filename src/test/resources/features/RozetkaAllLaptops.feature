Feature: Rozetka All Laptop page

  Background: Open Rozetka Laptop Page
    Given I am On Rozetka Laptops page

  @Tag
  Scenario: On page with Laptops choose seller 'Rozetka' and brand 'HP'
    When I choose seller Rozetka and brand HP
    Then the page title should start with "Ноутбуки HP, продавець Rozetka"

  @Tag
  Scenario: On Laptops page, choose seller Rozetka, brand HP and sort price from higher to lower
    When I choose seller Rozetka and brand HP
    When I choose 'From Higher To Lower price' in drop-down menu
    Then 'From Higher to lower prise' should be selected

  @Tag
  Scenario: On Laptops page after selection seller Rozetka, brand HP and price from higher to lower, choose first laptop
    When I choose seller Rozetka and brand HP
    When I choose 'From Higher To Lower price' in drop-down menu
    When I save title of first product on page
    When I choose first Laptop on page
    Then the page title should be equals to title of first Laptop on sorted Laptops page