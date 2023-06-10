@param
Feature: Login in to application from Excel

Scenario Outline: Login into application with different sets of Data from excel

Given user is the login page for yahoo
When user enter user name and password from <RowNum>
And clicks on login button
Then should sucessfully login into application


Examples:
 |RowNum|
 |2|
 |3|
 |4|
 |5|
 |6|
     