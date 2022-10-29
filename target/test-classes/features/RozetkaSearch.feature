Feature: Rozetka Search

  Background: Open Rozetka Main Page
    Given I am On Rozetka main page

  @Tag
  Scenario Outline:  Finding page with laptops
    When I search for "<query>"
    Then the page title should start with "<title>"
    Examples:
      | query          | title             |
      | Laptop         | Ноутбуки          |
      | телевізор      | Телевізори        |
      | телефон        | Мобільні телефони |
      | пральна машина | Пральні машини    |


