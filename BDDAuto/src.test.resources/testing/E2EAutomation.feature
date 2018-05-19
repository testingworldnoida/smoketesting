Feature: Puchase Electronic item on Sanpdeal

 Scenario: Purchase by registered user
 Given User is on login page
 When User enters username
 And  User enters password
 And  User clicks on signin button
 Then  User should be logged in
 When User click on Logout button
 Then User should be logged out
 
 