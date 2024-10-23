Feature: Search and Place the order for Products

@tomato
Scenario Outline: Search experience for product search in both home and offers page
Given User is on GreenCart Landing page
When user searched with shortname <Name> and extracted actual name of the product
Then user searched for <Name> shortname in offers page
And validate product name searched matches in offers page and landing page

Examples:
|	Name	|
|	Tom	|
| Beet |