Feature: DeleteMid Request

Scenario: User want to delete data from database by using id
    When User want to delete data by using URI "http://localhost:8080/foodMenus/7"
    Then Varify status code 200