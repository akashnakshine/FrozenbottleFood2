Feature: PostMid Request

@Post
Scenario: User wants to create or post the data in FoodMenu
Given user wants to pass the data into database
When user wants to pass the data by using URI as "http://localhost:8080/foodMenus"
Then user want to validate status code 415