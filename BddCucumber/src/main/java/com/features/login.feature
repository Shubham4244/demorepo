Feature: JBK Offline Application

Scenario: login test

Given user on login page
When user enters valid credentials
Then user should be on home page
