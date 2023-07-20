@B29G30-220
Feature: Calendar Event Creation

  As a Posmanager, I should be able to create events on my calendar from "Calendar" module

  Background:
    Given User on the login page of the application
    And User have entered the valid credentials
    And User click the Login button
@B29G30-199
  Scenario: Creating an event by clicking on time box
    When User on the Calendar module
    And User clicks on a time box on the calendar
    Then User should be able to create an event
    And User creates an event on the calendar
@B29G30-200
  Scenario: Viewing event details by clicking on the event
    When User on the Calendar module
    And User click on the created event on the calendar
    Then User should be able to see the event details
    And User should delete the event by clicking delete button