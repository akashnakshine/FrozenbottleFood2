Feature: Get by Id

Scenario: User want to read data from databse by using id
    
    When User want to fetch the data from the database by using id "http://localhost:8080/admin/40"
    Then User want to verify the statusline "HTTP/1.1"
    And User want verify the status code 200