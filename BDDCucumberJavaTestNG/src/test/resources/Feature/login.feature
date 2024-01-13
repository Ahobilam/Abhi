Feature: Login page automation of sauceDemo application
@tag
Scenario Outline: Login is successful with valid credentials
Given user is on login page
When user enters valid "<username>" and "<password>"
#And clicks on login button
Then user is navigated to home page
And close the browser

Examples:
|username               |password|
|standard_user          |secret_sauce|
#|locked_out_user        |secret_sauce|
|problem_user           |secret_sauce|
|performance_glitch_user|secret_sauce|
