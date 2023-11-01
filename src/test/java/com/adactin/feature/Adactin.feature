Feature: Hotel Booking In Adactin Application
@login
Scenario: User Login In The Web Application
Given user Launch The Url In Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page
@searchhotel
Scenario: User Enter The Details In The Search Hotel Page
When user Select The Location In The Location Field
And user Select The Hotel Name In The Hotels Field
And user Select The Room Type In The Room Field
And user Select The Number Of Rooms In The Number Of Room Selection Field
And user Pass The Date In The Check In Date Field
And user Pass The Date In The Check Out Date Field
And user Select The Adults Room In The Adult Room  Dropdown Field
And user Select The Child Room In The Child Room Dropdown Field
Then user Click The Search Button And It Navigates To Select Hotel Page
@selecthotel
Scenario: User Select The Hotel
When user Click The Select Hotel Radio Button In The Hotel Details
Then user Click The Continue Button And It Navigates To Book A Hotel Page
@hotelpage
Scenario: User Enter Details In The Book A Hotel Page
When user Enter The First Name In The First Name Field
And  user Enter The Last Name In The Last Name Field
And user Enter The Billing Address In The Billing Address Field
And user Enter The Card Details In The Credit Card Field
And user Select The Card Type In The Credit Card Type Dropdown
And user Select The Expriy Month And Year In The Expiry Date Dropdown
And user Enter The Cvv NUmber In Cvv Field
Then user Click The Book Noe Button And It Navigate To Booking Confirmation Page
@logout
Scenario: User Click The Logout Button 
Then user Click The Logout Button and It Navigate to Logout Page