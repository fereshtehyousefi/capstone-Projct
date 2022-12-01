Feature: Retail Home Page

  #Background: 
    #Given User is on retail website
#
  #@test @smoketest
  #Scenario: Verify Retail page logo
    #Then User verify retail page logo is present
#
  #@search
  #Scenario: Verify User can Search in Electronics Department
    #When User change the category to 'Electronics'
    #And User search for an item 'PlayStation'
    #And User click on Search icon
    #Then Item should be present
#
  #@test1 @smoketest
  #Scenario: Verify User can click on All section
    #When User click on All section
    #Then User verifies 'Shop By department' is present
#
  #@testCart
  #Scenario: Verify Cart icon is present
    #Then User verifies cart icon is present
#-----------------------------------------------------------------------------------
Background: 
Given User is on retail website 

@ShopByDepartmentSidbar
Scenario: Verify Shop by Department sidebar 
When User click on All section
Then below options are present in Shop by Department sidebar
|Electronics|Computers|Smart Home|Sports|Automative|
-----------------------------------------------------------------

@DepartmentSidebarOpstions
Scenario Outline: Verify department sidebar options 
When User click on All section
And User on <department> 
Then below options are present in department
|<optionOne>|<optionTwo>|
Examples: 
|department| optionOne| optionTwo|
| Electronics|TV & Video| Video Games|
|Computers |Accessories|Networking|
|Smart Home| Smart Home Lightning| Plugs and Outlets|
|Sports| Athletic Clothing| Exercise & Fitness|
|Automotive| Automative Parts & Accessories| MotorCycle & Powersports|



