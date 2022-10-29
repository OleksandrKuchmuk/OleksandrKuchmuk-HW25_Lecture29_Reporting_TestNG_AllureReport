Feature: Rozetka HP G8 Laptop page

  Background: Open Rozetka Laptop HP G8 Page
    Given I am On Rozetka Laptop HP G8 page

  @Tag
  Scenario: On page Laptop Hp G8 page click on 'Buy' and 'To order' buttons
    When I click on 'Buy' button
    When I click on 'To order' button
    Then the page title should start with "ROZETKA — Оформлення замовлення"

  @Tag
  Scenario: Take count and total price Products in Basket
    When I click on 'Buy' button
    When I click on 'To order' button
    When I take count products in Basket
    When I take total prise of products in Basket
    Then I check that count products in basket is 1
    Then I check that total prise of products in basket less than 200000