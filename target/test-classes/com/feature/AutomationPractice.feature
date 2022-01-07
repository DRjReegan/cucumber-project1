Feature: Women Dress Purchasing In AutomationPractice Website

Scenario: Signin
Given user Creates A Session
Then user Clicks The SigninButton
 
When user Enters The Email In Email Field
And user Enters The Paswword In Password Field
Then user Clicks On The Signin Button And It Navigates To The Home Page
 
 Scenario: Purchase A Dress In Women Section
 When user Selects The Evening Dresses From Women Section
 And user Clicks The Pink Colour Icon Button
 And user Clicks The Add To Cart Button
 And user Clicks The Proceed To Checkout Button
 And user Increases The Quantity 4Times
 And user Clicks The Proceed To Checkout Button To Confirm
 And user Clicks The Proceed To Checkout Buttons
 And user Clicks The Radio Button
 Then user Clicks The Proceed To Checkout Button Again
 
 Scenario: Payment Method
 When User Clicks The Pay By BankWire Button
 Then User Clicks The I Confirm The Order Button