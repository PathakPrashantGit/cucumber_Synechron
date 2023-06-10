@gmail@yahoo
Feature: Login into application
@gmail@yahoo
Scenario: Login into application with valid credentials

Given user is in the loginpage
When user entered valid username and password
And click on sigin button
Then sucessfully should login
@gmail@yahoo
Scenario: Login into application with invalid credentials

Given user is in the loginpage
When user entered invalid username and password
And click on sigin button
Then sucessfully should not login

Scenario: Login into application with valid credentials

Given user is in the loginpage
When user entered valid username as "Name1" and password as "pwd1"
And click on sigin button
Then sucessfully should login

Scenario: Login into application with valid credentials

Given user is in the loginpage
When user entered valid username as "Name2" and password as "pwd2"
And click on sigin button
Then sucessfully should login

Scenario: Login into application with valid credentials

Given user is in the loginpage
When user entered valid username as "Name3" and password as "pwd3"
And click on sigin button
Then sucessfully should login