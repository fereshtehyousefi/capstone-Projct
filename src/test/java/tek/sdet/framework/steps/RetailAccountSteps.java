package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	
	@When("User click on Account option")
    public void userClickOnAccountOption () {
        click(factory.AccountPage().account);
        logger.info("user successfylly clicked on Account option");
        slowDown();
    }
    
    
    // @updateProfile
    //  Scenario: Verify User can update Profile Information
    @And("User update Name {string} and Phone {string}")
    public void userUpdateNameAndPhone (String name, String phone) {
        clearTextUsingSendKeys(factory.AccountPage().NameField);
        sendText(factory.AccountPage().NameField,name);
        clearTextUsingSendKeys(factory.AccountPage().PhoneField);
        sendText(factory.AccountPage().PhoneField,phone);
        logger.info("user entered name and phone successfully");
            
    }
    
    @And("User click on Update button")
    public void userClickOnUpdateButton () {
        click(factory.AccountPage().Updatebtn);
        logger.info("user clicked on update button");
        slowDown();
    }



   
    @Then("user profile information should be updated")
    public void userProfileInfoprmationShouldBeUpdated() {
        waitTillPresence(factory.AccountPage().Message);
        Assert.assertTrue(isElementDisplayed(factory.AccountPage().Message));
        logger.info("user profile updated successfully");
    }
    
    
    
    // @UpdatePass
    //  Scenario: Verify User can Update password
    
    
    @And("User enter below information")
    public void userEnterBelowInformation (DataTable data) {
        List<Map<String, String>> changepass =data.asMaps(String.class,String.class);
        sendText(factory.AccountPage().PrevPassInput,changepass.get(0).get("previousPassword"));
        sendText(factory.AccountPage().NewPassInput,changepass.get(0).get("newPassword"));
        sendText(factory.AccountPage().ConfirmPassInput,changepass.get(0).get("confirmPassword"));
        logger.info("user entred below info");
        slowDown();    
    }
    
    @And("User click on Change Password button")
    public void userClieckOnChangePasswordButton() {
        click(factory.AccountPage().ChangePassBtn);
        logger.info("user clicked on Change Password Button");
    }    
    
    @Then("a message should be displayed Password Updated Successfully")
    public void messgaeShouldBeDisplayed() {
        slowDown();
        Assert.assertTrue(isElementDisplayed(factory.AccountPage().PassUpdatedSuccessfully));
        logger.info("Password Updated Successfully");
    
    }
	
//	@AddPaymentmethod
//	  Scenario: Verify User can add a payment method
	@And ("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.AccountPage().AddaPaymentMethod);
		logger.info("User click on Add a payment method link");
	}
	
	
	@And ("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String,String>>DebitCard=data.asMaps(String.class,String.class);
		sendText(factory.AccountPage().cardNumberInput,DebitCard.get(0).get("cardNumber"));
		sendText(factory.AccountPage().nameOnCardInput,DebitCard.get(0).get("nameOnCard"));
		sendText(factory.AccountPage().expirationMonthInput,DebitCard.get(0).get("expirationMonth"));
		sendText(factory.AccountPage().expirationYearInput,DebitCard.get(0).get("expirationYear"));
		sendText(factory.AccountPage().securityCodeInput,DebitCard.get(0).get("securityCode"));
		logger.info("User fill Debit or credit card information");
		slowDown(); 
	}
	
	@And ("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		waitTillClickable(factory.AccountPage().paymentSubmitBtn);
		click(factory.AccountPage().paymentSubmitBtn);
		logger.info("User click on Add your card button");
		slowDown(); 
	}
	
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void AMassegeSouldBeDisplayed() {
		slowDown(); 
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().PaymentMethodupdatedSuccessfully));
		logger.info( "Payment Method added successfully");
		 
		
	}
	
 
	
	// @EditDebitOrCreditCard
//	  Scenario: Verify User can edit Debit or Credit card

	@And ("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.AccountPage().EditOption);
		logger.info("User click on Edit option of card section");
	}
	

	
	@And ("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.AccountPage().paymentSubmitBtn);
		logger.info("user click on Update Your Card button");
		
	}
	
	
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayed() {
		slowDown();
	Assert.assertTrue(isElementDisplayed(factory.AccountPage().paymentMethodupdatedSuccessfully));
		
logger.info("Payment Method added successfully");

	
	}

	
	
	//Scenario: Verify User can remove Debit or Credit card 
	
	@And ("User click on card payment")
	public void userClickOnCardPayment() {
		click(factory.AccountPage().cardPayment);
		logger.info("User click on card payment");
		
	}
	
	@And ("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.AccountPage().removedCard);
		logger.info("User click on remove option of card section");
		
	}
	
	@Then ("payment details should be removed")
	public void paymentDetailsShouldbeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().CardsAndAccounts));
		logger.info("payment details should be removed");
		
	}
	
	
	// Scenario: Verify User can add an Address
	
	
	@And ("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.AccountPage().AddAddress);
		logger.info("User click on Add address option");
	}
	
	@And("user fill new address form with below information")
    public void userFillTheInformation(DataTable data) {
        List<Map<String, String>> AddAddress = data.asMaps(String.class,String.class);
        
        selectByVisibleText(factory.AccountPage().Country,AddAddress.get(0).get("country"));
        clearTextUsingSendKeys(factory.AccountPage().FullName);
        sendText(factory.AccountPage().FullName,AddAddress.get(0).get("fullName"));
        clearTextUsingSendKeys(factory.AccountPage().PhoneNumber);
        sendText(factory.AccountPage().PhoneNumber,AddAddress.get(0).get("phoneNumber"));
        clearTextUsingSendKeys(factory.AccountPage().StreetAddress);
        sendText(factory.AccountPage().StreetAddress,AddAddress.get(0).get("streetAddress"));
        clearTextUsingSendKeys(factory.AccountPage().ApartmentInput);
        sendText(factory.AccountPage().ApartmentInput,AddAddress.get(0).get("apt"));
        clearTextUsingSendKeys(factory.AccountPage().CityInput);
        sendText(factory.AccountPage().CityInput,AddAddress.get(0).get("city"));
        clearTextUsingSendKeys(factory.AccountPage().State);
        selectByVisibleText(factory.AccountPage().State,AddAddress.get(0).get("state"));
        clearTextUsingSendKeys(factory.AccountPage().ZipCode);
        sendText(factory.AccountPage().ZipCode,AddAddress.get(0).get("zipCode"));
        logger.info("User filled the field");
        slowDown();
            
    }
		
	
	
	@And ("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.AccountPage().Addaddress);
		logger.info("User click Add Your Address button");
		
	}
	
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().AddressAddedSuccessfully));
		logger.info("a message should be displayed");
	    
	}
	
	
	//@EditAddress
//  Scenario: Verify User can edit an Address added on account
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption () {
		click(factory.AccountPage().EditAddress);
		logger.info("user clicked on Edit button");
		
	}


@And("User click update Your Address button")
	public void userClickUpdateYourAddressBtn() {
		click(factory.AccountPage().UpdateYourAddress);
		logger.info("User clicked on Update Your Address");
		
	}
@Then ("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().AddressUpdatedSuccessfully));
		logger.info("Your New Address Updated");

	}

	
	
	
//@removeOldAddress
//  Scenario: Verify User can remove Address from Account
	 
	@And("User click on remove option of Address section")
	public void userClickedOnRemoveOption() {
		click(factory.AccountPage().RemoveAddress);
		logger.info("User clicked on remove button");
		
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		//Assert.assertTrue(isElementDisplayed(factory.AccountPage().Account)); There is no msg to validate.
		logger.info("User removed the address");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


















	
	
	
	
	

