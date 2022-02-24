Feature: Testing the Amzon Login Feature and Product Add To Cart of Active Time Appllication

Background:
# it is used to perform repeated Action and to removed the redundant code for faster execution
#precondition itself
Given The brower is launched
And  The Apllication is loaded

Scenario: Testing the login feature with valid data

#precondition itself
#Given The brower is launched
#And  The Apllication is loaded

#Representing  the Action of Test cases
And The user click on SignIn button
When The user Enters the valid user name
And The user click on continue button
And The user Enter the valid password
And The user Click on Login button
Then The user mouse over on the Account&List
And The User Click On Your Account
And The User Click On Your Address
Then The User Click On Add Address
When The User Search the Product
And add the Product into Cart
And add Address to Deliver the Product