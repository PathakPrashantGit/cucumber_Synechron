Feature: Login in to application from DataTable

Scenario Outline: Login into application with different sets of Data from datatable

Given user is the login page for yahoo
When user enter user name as <Name> and password as <Password>
And clicks on login button
Then should sucessfully login into application

Examples:
 |Name|Password|
 |Name1|Password1|
 |Name2|Password2|
 |Name3|Password3|
 |Name4|Password4|