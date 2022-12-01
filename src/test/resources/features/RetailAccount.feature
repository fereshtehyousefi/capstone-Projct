Feature: Retail Account Featur

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'noorullahyousefi@tekschool.us' and password 'Tek@12345'
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
      | previousPassword | newPassword | confirmPassword |
      | Tek@12345        | Tak@56789   | Tak@56789       |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @AddPaymentmethod
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567891011123 | noorullah  |              09 |             26 |          234 |
    And User click on Add your card button

  Then message should be displayed ‘Payment Method added successfully’
  @EditDebitOrCreditCard
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on card payment
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 0987654321098765 | Rahmani    |              05 |             27 |          567 |
    And user click on Update Your Card button

  Then a message should be displayed ‘Payment Method updated Successfully’
  @RemoveCard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on card payment
    And User click on remove option of card section
    Then payment details should be removed

  @AddAdress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName           | phoneNumber | streetAddress | apt | city     | state | zipCode |
      | United States | Noorullah Rahmanio |  4135673344 | 29 String st  | B   | Chicopee | MA    |   01040 |
    And User click Add Your Address button
 Then a message should be displayed ‘Address Added Successfully’
 
 
 @EditAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form the below information
      | country       | fullName          | phoneNumber | streetAddress | apt | city     | state | zipCode |
      | United States | test |  4135673344 | 21 String st  | B   | Chicopee | MA    |   01050 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

    
    @RemoveAddress
    Scenario: Verify User can remove Address from Account 
    When User click on Account option 
    And User click on remove option of Address section
    Then Address details should be removed
  
    
   