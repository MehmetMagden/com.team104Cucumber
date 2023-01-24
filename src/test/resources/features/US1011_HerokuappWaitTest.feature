

Feature: US1011 Heruokuapp delete button test

 Scenario: TC15 testing delete button isvisible

When user manually goes to "https://the-internet.herokuapp.com/add_remove_elements/" homepage
 When Click the "Add Element" button
 Then Wait until the "Delete" button is visible
 And Test that the "Delete" button is visible
 Then Delete the button by pressing the Delete button
 Then Test that the delete button is not visible
  And closes the page
