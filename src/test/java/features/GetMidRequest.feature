Feature: Get Mid Request
Scenario: User want to read the data from data
    When  User want to fetch tha data from database "http://localhost:8080/foodMenus/7"
    Then User want to varify the status code 200