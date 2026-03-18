Feature: Interact will all GUI Element
Background: 
Given user is at BlogSpot Automation page

Scenario: Fill the form details
When user enters the name as "Rohit Sharma" 
And user enters the email as "rohitsharma@abc.com"
And user enter the phoneNumber as "9876543210"
And user enters the address as "hyper street, DC"
Then user close the Browser

Scenario: Radio and Dropdown
When user select the gender as male
And user select the days as monday and wednesday
And user select China from the dropdown
Then user close the Browser

Scenario: List on webpage
When user selects green color
And user selects Dog
Then user close the Browser