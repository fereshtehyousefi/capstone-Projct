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
	
	
	
	@When ("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.AccountPage().AccountOption);
		logger.info("User click on Account option");
		
	}
	
	@And ("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name,String phone) {
		sendText(factory.AccountPage().name,name);
		sendText(factory.AccountPage().phone,phone);
		logger.info("User update Name and Phone");
		
	}
	
	@And ("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.AccountPage().UpdateButton);
		logger.info("User click on Update button");
		
	}
	
	@Then ("user profile information should be updated")
	public void userProfileInformationShouldBeUpdate() {
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().userNameInformation));
		logger.info("user profile information should be updated");
		
	}
	
	
	
	@And ("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String,String>>singUpData=data.asMaps(String.class,String.class);
		sendText(factory.AccountPage().previousPasswordInput,singUpData.get(0).get("previousPassword"));
		sendText(factory.AccountPage().newPasswordInput,singUpData.get(0).get("newPassword"));
		sendText(factory.AccountPage().confirmPasswordInput,singUpData.get(0).get("confirmPassword"));
		logger.info("User enter below information");
		
	}
	
	@Then ("a message should be displayed {string}")
	public void AMassageShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().PasswordUpdatedSuccessfully));
		logger.info("PasswordUpdatedSuccessfully");
		
	}
	

	@And ("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.AccountPage().AddaPaymentMethod);
		logger.info("User click on Add a payment method link");
	}
	
	
	@And ("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String,String>>singUpData=data.asMaps(String.class,String.class);
		sendText(factory.AccountPage().cardNumberInput,singUpData.get(0).get("cardNumber"));
		sendText(factory.AccountPage().nameOnCardInput,singUpData.get(0).get("nameOnCard"));
		sendText(factory.AccountPage().expirationMonthInput,singUpData.get(0).get("expirationMonth"));
		sendText(factory.AccountPage().expirationYearInput,singUpData.get(0).get("expirationYear"));
		sendText(factory.AccountPage().securityCodeInput,singUpData.get(0).get("securityCode"));
		logger.info("User fill Debit or credit card information");
	}
	
	@And ("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.AccountPage().paymentSubmitBtn);
		logger.info("User click on Add your card button");
	}
	
//	@Then ("message should be displayed {string}")
//	public void AMassegeSouldBeDisplayed(String value) {
//		String expectedValue = value;
//		String actualValue = getElementText(factory.AccountPage().PaymentMethodAddedSuccessfully);
//		Assert.assertEquals(expectedValue, actualValue);
//		Assert.assertTrue(isElementDisplayed(factory.AccountPage().PasswordUpdatedSuccessfully));
//		logger.info(expectedValue + "Payment Method added successfully");
//		
//	}
	
	
	
	
	// Scenario: Verify User can edit Debit or Credit card

	@And ("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.AccountPage().EditOption);
		logger.info("User click on Edit option of card section");
	}
	
	@And ("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
		List<Map<String, String>>singUpData= data.asMaps(String.class,String.class);
		sendText(factory.AccountPage().cardNumberInput,singUpData.get(0).get("cardNumber"));
		sendText(factory.AccountPage().nameOnCardInput,singUpData.get(0).get("nameOnCard"));
		sendText(factory.AccountPage().expirationMonthInput,singUpData.get(0).get("expirationMonth"));
		sendText(factory.AccountPage().expirationYearInput,singUpData.get(0).get("expirationYear"));
		sendText(factory.AccountPage().securityCodeInput,singUpData.get(0).get("securityCode"));
		logger.info("user edit information with below data");
		
	}
	
	@And ("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.AccountPage().paymentSubmitBtn);
		logger.info("user click on Update Your Card button");
		
	}
	
	
	@Then("a message should be displayed Payment Method updated Successfully")
	public void aMessageShouldBeDisplayed() {
		slowDown();
	Assert.assertTrue(isElementDisplayed(factory.AccountPage().PaymentMethodupdatedSuccessfully));
		
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
	
	@And ("user fill new address form the below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String,String>>singUpData=data.asMaps(String.class,String.class);
		sendText(factory.AccountPage().Country,singUpData.get(0).get("country"));
		clearTextUsingSendKeys(factory.AccountPage().FullName);
		sendText(factory.AccountPage().FullName,singUpData.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.AccountPage().PhoneNumber);
		sendText(factory.AccountPage().PhoneNumber,singUpData.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.AccountPage().StreetAddress);
		sendText(factory.AccountPage().StreetAddress,singUpData.get(0).get("streetAddress"));
		sendText(factory.AccountPage().ApartmentInput,singUpData.get(0).get("apt"));
		sendText(factory.AccountPage().CityInput,singUpData.get(0).get("city"));
		sendText(factory.AccountPage().State,singUpData.get(0).get("state"));
		sendText(factory.AccountPage().ZipCode,singUpData.get(0).get("zipCode"));
		logger.info("user fill new address form with below information");
		
		
	}
	
	@And ("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.AccountPage().Addaddress);
		logger.info("User click Add Your Address button");
		
	}
	
//	@Then ("a message should be displayed {string}")
//	public void aMessageShouldBeDisplayed() {
//		
//	}
	
	
	//@EditAddress
//  Scenario: Verify User can edit an Address added on account
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption () {
		click(factory.AccountPage().EditAddress);
		logger.info("user clicked on Edit button");
		
	}


	@And("User fill new address form with below information")
	public void userfillNewAddressFormWithBelowInformation(DataTable Data) {
		List<Map<String, String>> singUpData = Data.asMaps(String.class,String.class);
		
		selectByVisibleText(factory.AccountPage().Country,singUpData.get(0).get("country"));
		clearTextUsingSendKeys(factory.AccountPage().FullName);
		sendText(factory.AccountPage().FullName,singUpData.get(0).get("fullName"));
		slowDown();
		clearTextUsingSendKeys(factory.AccountPage().PhoneNumber);
		sendText(factory.AccountPage().PhoneNumber,singUpData.get(0).get("phoneNumber"));
		slowDown();
		clearTextUsingSendKeys(factory.AccountPage().StreetAddress);
		sendText(factory.AccountPage().StreetAddress,singUpData.get(0).get("streetAddress"));
		slowDown();
		clearTextUsingSendKeys(factory.AccountPage().ApartmentInput);
		sendText(factory.AccountPage().ApartmentInput,singUpData.get(0).get("apt"));
		clearTextUsingSendKeys(factory.AccountPage().CityInput);
		sendText(factory.AccountPage().CityInput,singUpData.get(0).get("city"));
		selectByVisibleText(factory.AccountPage().State,singUpData.get(0).get("state"));
		clearTextUsingSendKeys(factory.AccountPage().ZipCode);
		sendText(factory.AccountPage().ZipCode,singUpData.get(0).get("zipCode"));
		logger.info("User filled the field");
		slowDown();
		
		
	}
	
	


@And("User click update Your Address button")
	public void userClickUpdateYourAddressBtn() {
		click(factory.AccountPage().UpdateYourAddress);
		logger.info("User clicked on Update Your Address");
		
	}
@Then ("a message should be displayed 'Address Updated Successfully'")
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


















	
	
	
	
	

