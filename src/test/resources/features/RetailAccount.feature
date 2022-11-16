Feature: Retail Account Featur

Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'noorullah@tekschool.us' and password 'Tek@56789'
    And User click on login button
    And User should be logged in into Account
    
    @UpbateProfile
    Scenario: Verify User can update Profile Information 
    When User click on Account option 
    And User update Name "noorullahRahmani" and Phone "4132344567"
    And User click on Update button 
    Then user profile information should be updated 
    
    
    @UpdatePassword
    Scenario: Verify User can Update password 
    When User click on Account option 
    And User enter below information 
    |previousPassword| newPassword|confirmPassword|
    |Tek@56789       |Tak@12345   |Tak@12345      |
    And User click on Change Password button 
    Then a message should be displayed ‘Password Updated Successfully’
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    