Feature: HotelBooking Form

Background: User has already logged in to hotel application
and is navigated to Hotel Booking register page. 

Scenario: check the heading of hotel booking page
Given User is already in hotel booking page
Then check the heading of the page

Scenario: Prompt user when user leaves the first name
Given User is already in hotel booking page
When first Name is empty
Then display the error message to user and close

Scenario: Prompt user when user leaves the last name
Given User is already in hotel booking page
When last Name is empty
Then display the error message to user and close

Scenario: Prompt user  when user leaves the email
Given User is already in hotel booking page
When email is empty and click submit
Then display the error message to user and close

Scenario: Prompt user when user leaves the mobile no
Given User is already in hotel booking page
When mobile num is empty and click submit
Then display the error message to user and close

Scenario: prompt user when user enters the invalid mobile no format
Given User is already in hotel booking page
When user enters the invalid valid mobile no
|6302088199|
|96521300145|
|2668926124|
|96582|
| |
|' '|
|9550608053|
Then display the error message to user and close

Scenario: Prompt user when user leaves the city
Given User is already in hotel booking page
When if user is not selecting city
Then display the error msg to user and close

Scenario: Prompt user when user leaves the state
Given User is already in hotel booking page
When if user is not selecting state
Then display the error msg to user and close

Scenario Outline: Validate the number of rooms alloted 
Given User is already in hotel booking page
When user enters <numberOfGuests>
Then for <numberOfGuests> allocate <numberOfRooms>
Examples:
|numberOfGuests|numberOfRooms|
|1|1|
|2|1|
|3|1|
|4|2|
|5|2|
|6|2|

Scenario: Prompt user when user leaves the card holder name
Given User is already in hotel booking page
When user does not enter card holder name
Then display the error msg to user and close

Scenario: Prompt when user leaves the debit card number
Given User is already in hotel booking page
When user does not enter debit card number
Then display the error msg to user and close

Scenario: Prompt user when user leaves the cvv
Given User is already in hotel booking page
When user does not enter cvv
Then display the error msg to user and close

Scenario: Prompt user when user leaves the expiration month
Given User is already in hotel booking page
When user does not enter expiration month
Then display the error msg to user and close

Scenario: Prompt user when user leaves the expiration year
Given User is already in hotel booking page
When user does not enter expiration year 
Then display the error msg to user and close

Scenario: sucessful login with valid data
Given User is already in hotel booking page
When on user entering valid data 
Then on successfully navigate to home page 