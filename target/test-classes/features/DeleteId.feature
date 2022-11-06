Feature: DeleteId

Scenario: User want to delete data from database by using id
When User want to delete data by using URI "http://localhost:8080/admin/31"
Then Verify status code 200