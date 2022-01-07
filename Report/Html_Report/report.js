$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/AutomationPractice.feature");
formatter.feature({
  "line": 1,
  "name": "Women Dress Purchasing In AutomationPractice Website",
  "description": "",
  "id": "women-dress-purchasing-in-automationpractice-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Signin",
  "description": "",
  "id": "women-dress-purchasing-in-automationpractice-website;signin",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user Creates A Session",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Clicks The SigninButton",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user Enters The Email In Email Field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The Paswword In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Clicks On The Signin Button And It Navigates To The Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Creates_A_Session()"
});
formatter.result({
  "duration": 14202648122,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_The_SigninButton()"
});
formatter.result({
  "duration": 5866685796,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enters_The_Email_In_Email_Field()"
});
formatter.result({
  "duration": 981721257,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enters_The_Paswword_In_Password_Field()"
});
formatter.result({
  "duration": 169790027,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_On_The_Signin_Button_And_It_Navigates_To_The_Home_Page()"
});
formatter.result({
  "duration": 4979984462,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Purchase A Dress In Women Section",
  "description": "",
  "id": "women-dress-purchasing-in-automationpractice-website;purchase-a-dress-in-women-section",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user Selects The Evening Dresses From Women Section",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Clicks The Pink Colour Icon Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Clicks The Add To Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Clicks The Proceed To Checkout Button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Increases The Quantity 4Times",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Clicks The Proceed To Checkout Button To Confirm",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Clicks The Proceed To Checkout Buttons",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Clicks The Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Clicks The Proceed To Checkout Button Again",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Selects_The_Evening_Dresses_From_Women_Section()"
});
formatter.result({
  "duration": 6772005468,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_The_Pink_Colour_Icon_Button()"
});
formatter.result({
  "duration": 6035956391,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_The_Add_To_Cart_Button()"
});
formatter.result({
  "duration": 2115148807,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_The_Proceed_To_Checkout_Button()"
});
formatter.result({
  "duration": 6099510957,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 28
    }
  ],
  "location": "Step_Def.user_Increases_The_Quantity_Times(int)"
});
formatter.result({
  "duration": 2205231895,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_The_Proceed_To_Checkout_Button_To_Confirm()"
});
formatter.result({
  "duration": 3892941659,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_The_Proceed_To_Checkout_Buttons()"
});
formatter.result({
  "duration": 3668048992,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_The_Radio_Button()"
});
formatter.result({
  "duration": 2083150186,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_The_Proceed_To_Checkout_Button_Again()"
});
formatter.result({
  "duration": 5264008936,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Payment Method",
  "description": "",
  "id": "women-dress-purchasing-in-automationpractice-website;payment-method",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "User Clicks The Pay By BankWire Button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User Clicks The I Confirm The Order Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Clicks_The_Pay_By_BankWire_Button()"
});
formatter.result({
  "duration": 3957525272,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Clicks_The_I_Confirm_The_Order_Button()"
});
formatter.result({
  "duration": 4002647586,
  "status": "passed"
});
});