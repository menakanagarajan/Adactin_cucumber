$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Url In Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Url_In_Adactin_Application()"
});
formatter.result({
  "duration": 3356943500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Username_In_Username_Field()"
});
formatter.result({
  "duration": 265616500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 157800700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1269841800,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User Enter The Details In The Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-enter-the-details-in-the-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@searchhotel"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user Select The Location In The Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Select The Hotel Name In The Hotels Field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select The Room Type In The Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Select The Number Of Rooms In The Number Of Room Selection Field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Pass The Date In The Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Pass The Date In The Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select The Adults Room In The Adult Room  Dropdown Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select The Child Room In The Child Room Dropdown Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Click The Search Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Location_In_The_Location_Field()"
});
formatter.result({
  "duration": 658130700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_Name_In_The_Hotels_Field()"
});
formatter.result({
  "duration": 324297000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Room_Type_In_The_Room_Field()"
});
formatter.result({
  "duration": 400992200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_Of_Rooms_In_The_Number_Of_Room_Selection_Field()"
});
formatter.result({
  "duration": 136492900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Pass_The_Date_In_The_Check_In_Date_Field()"
});
formatter.result({
  "duration": 353199200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Pass_The_Date_In_The_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 173101200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Adults_Room_In_The_Adult_Room_Dropdown_Field()"
});
formatter.result({
  "duration": 298353100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Child_Room_In_The_Child_Room_Dropdown_Field()"
});
formatter.result({
  "duration": 338506700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 723694400,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User Select The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@selecthotel"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user Click The Select Hotel Radio Button In The Hotel Details",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user Click The Continue Button And It Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Select_Hotel_Radio_Button_In_The_Hotel_Details()"
});
formatter.result({
  "duration": 140117500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 786800300,
  "status": "passed"
});
});