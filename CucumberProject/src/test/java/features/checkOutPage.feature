Feature: Check Out page features.

#Scenario Outline: Search experience for product search in both home and offers page

#Given User is on GreenCart Landing page
#When user searched with shortname <Name> and extracted actual name of the product
#Then user searched for <Name> shortname in offers page
#And validate product name searched matches in offers page and landing page

@cucumber
Scenario Outline: Verify the products added to cart in landing page are displayed in the Checkout page.
Given User is on GreenCart Landing page
When user searched with shortname <Name> and extracted actual name of the product
#And Clicked on plus icon to add more items in landing page
#And Clicks on cart icon in landing page
#And User clicked Proceed To Checkout button
#Then User should be navigated to Checkout page
#And Verify Product Name and Quantity matches with landing page
#And Verify Apply and Place Order buttons are enabled and displayed

Examples:
|	Name	|
|	Cucumber	|