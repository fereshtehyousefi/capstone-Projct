package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;


public class HomeSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	String expectedTitle = "React App";
	String actualTitle = getTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	logger.info(actualTitle +" is equal to "+ expectedTitle);
	}
	


	
//	@AllSection
//	Scenario: Verify Shop by Department sidebar 
	
	@When("User click on All section")
	public void userClickOnAllSection() {
	  click(factory.homePage().AllSection);
	  logger.info("User click on All section");
	  slowDown();
	}
	
	
	@Then ("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable options) {
//		Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
//		Assert.assertTrue(isElementDisplayed(factory.homePage().Computers));
//		Assert.assertTrue(isElementDisplayed(factory.homePage().SmartHome));
//		Assert.assertTrue(isElementDisplayed(factory.homePage().Sports));
//		Assert.assertTrue(isElementDisplayed(factory.homePage().Automative));
		logger.info("below_options_are_present_in_Shop_by_Department_sidebar");	
    }

	
//	@Department
//	Scenario Outline: Verify department sidebar options 
	 String department;
     @When("User is on {string}")
      public String userOnElectronics(String department) {
        switch (department) {
          case "Electronics":
              Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
              logger.info("user is on Electronics section");
              break;
              
          case "Computers":
              Assert.assertTrue(isElementDisplayed(factory.homePage().Computers));
              logger.info("user is on Computers section");
              break;
              
          case "Smart Home":
              Assert.assertTrue(isElementDisplayed(factory.homePage().SmartHome));
              logger.info("user is on Smart Home section");
              break;



         case "Sports":
              Assert.assertTrue(isElementDisplayed(factory.homePage().Sports));
              logger.info("user is on Sports section");
              break;
              
          case "Automotive":
              Assert.assertTrue(isElementDisplayed(factory.homePage().Automative));
              logger.info("user is on Automotive section");
              break;
          default:



        }



       return this.department = department;
     }


	
	  @Then("below options are present in department")
	    public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	        List<List<String>> department = dataTable.asLists();

	       switch (this.department) {
	        case "Electronics":
	            click(factory.homePage().electronics);
	            String video = getText(factory.homePage().VideoAndGames);
	            String TVAndVideo = getText(factory.homePage().TVAndVideo);
	            Assert.assertEquals(TVAndVideo, department.get(0).get(0));
	            Assert.assertEquals(video, department.get(0).get(1));
	            logger.info(video + " options are present in department" + TVAndVideo);
	            break;
	        case "Computers":
	            click(factory.homePage().Computers);
	            String Accessories = getText(factory.homePage().Accessories);
	            String Networking = getText(factory.homePage().Networking);
	            Assert.assertEquals(Accessories, department.get(0).get(0));
	            Assert.assertEquals(Networking, department.get(0).get(1));
	            logger.info(Accessories + " options are present in department" + Networking);
	            break;
	        case "Smart Home":
	            click(factory.homePage().SmartHome);
	            String SmartHomeLightning = getText(factory.homePage().SmartHomeLightning);
	            String PlugsandOutlets = getText(factory.homePage().PlugsAndOutlets);
	            Assert.assertEquals(SmartHomeLightning, department.get(0).get(0));
	            Assert.assertEquals(PlugsandOutlets, department.get(0).get(1));
	            logger.info(SmartHomeLightning + " options are present in department" + PlugsandOutlets);
	            break;
	        case "Sports":
	            click(factory.homePage().Sports);
	            String AthleticClothing = getText(factory.homePage().AthleticClothing);
	            String ExerciseFitness = getText(factory.homePage().ExerciseAndFitness);
	            Assert.assertEquals(AthleticClothing, department.get(0).get(0));
	            Assert.assertEquals(ExerciseFitness, department.get(0).get(1));
	            logger.info(AthleticClothing + " options are present in department" + ExerciseFitness);
	            break;
	        case "Automotive":
	            click(factory.homePage().Automative);
	            String AutomativePartsAccessories = getText(factory.homePage().AutomativePartsAndAccessories);
	            String MotorCyclePowersports = getText(factory.homePage().MotorCycleAndPowersports);
	            Assert.assertEquals(AutomativePartsAccessories, department.get(0).get(0));
	            Assert.assertEquals(MotorCyclePowersports, department.get(0).get(1));
	            logger.info(MotorCyclePowersports + " options are present in department" + AutomativePartsAccessories);
	            break; } }

//	  @additem
//	  Scenario: Verify User can add an item to cart
	  @When("User change the category to {string}")
		public void userChangeThecategorytoSmartHome(String Value) {
			selectByVisibleText(factory.homePage().AllSearch,Value);
			logger.info("All Department changed to" + Value );	
			slowDown();
		}

	  @When("User search for an item {string}")
	  public void userSearchForAnItem(String item) {
		  sendText(factory.homePage().searchInput, item);
	      logger.info("User search for an item 'kasa outdoor smart plug'");
	      slowDown();
	      
	  }
	  @When("User click on Search icon")
	  public void userClickOnSearchIcon() {
	      click(factory.homePage().searchBtn);
	      logger.info("User click on Search icon");
	      slowDown();
	  }
	  @When("User click on item")
	  public void userClickOnItem() {
	      click(factory.homePage().Item);
	      logger.info("User click on item");
	      slowDown();
	  }
	  @When("User select quantity {string}")
	  public void userSelectQuantity(String qyt) {
	      sendText(factory.homePage().QYT, qyt);
	      logger.info("User select quantity '2'");
	      slowDown();
	  }
	  @When("User click add to Cart button")
	  public void userClickAddToCartButton() {
	      click(factory.homePage().addToCartBtn);
	      logger.info("User click add to Cart button");
	      slowDown();
	  }
	  @Then("the cart icon quantity should change to {string}")
	  public void theCartIconQuantityShouldChangeTo(String cartQuantity) {
	      Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantity));
	      logger.info("the cart icon quantity should change to '2'");
	      slowDown();
	  }

//	  @placeAnOrder
//	  Scenario: Verify User can place an order without Shipping address and payment Method on file
	  
	  @Then("User click on Cart option")
	  public void userClickOnCartOption() {
	      click(factory.homePage().cartBtn);
	      logger.info("User click on Cart option");
	      slowDown();
	  }
	  @Then("User click on Proceed to Checkout button")
	  public void userClickOnProceedToCheckoutButton() {
		  click(factory.homePage().proceedBtn);
	     logger.info("User click on Proceed to Checkout button");
	     slowDown();
	  }
	  @Then("User click Add a new address link for shipping address")
	  public void userClickAddANewAddressLinkForShippingAddress() {
		  click(factory.homePage().addNewAddressBtn);
		  logger.info("User click Add a new address link for shipping address");
		  slowDown();
	  }
	  @Then("User fill the new address form with below information")
	  public void userFillTheNewAddressFormWithBelowInformation(DataTable data) {
		  List<Map<String,String>>NewAddress=data.asMaps(String.class,String.class);
		  selectByVisibleText(factory.homePage().countryDropdown,NewAddress.get(0).get("Country"));
		  clearTextUsingSendKeys(factory.homePage().fullName);
		  sendText(factory.homePage().fullName,NewAddress.get(0).get("FullName"));
		  clearTextUsingSendKeys(factory.homePage().phoneNumberInput);
		  sendText(factory.homePage().phoneNumberInput,NewAddress.get(0).get("PhoneNumber"));
		  clearTextUsingSendKeys(factory.homePage().streetInput);
		  sendText(factory.homePage().streetInput,NewAddress.get(0).get("StreetAddress"));
		  clearTextUsingSendKeys(factory.homePage().apartment);
		  sendText(factory.homePage().apartment,NewAddress.get(0).get("Apt"));
		  clearTextUsingSendKeys(factory.homePage().city);
		  sendText(factory.homePage().city,NewAddress.get(0).get("City"));
		  clearTextUsingSendKeys(factory.homePage().stateInput);
		  sendText(factory.homePage().stateInput,NewAddress.get(0).get("State"));
		  clearTextUsingSendKeys(factory.homePage().zipCodeInput);
		  sendText(factory.homePage().zipCodeInput,NewAddress.get(0).get("ZipCode"));
		  logger.info("User fill the new address form with below information");
		  slowDown();
	  }
	  @Then("User click Add Your Address  button")
	  public void userClickAddYourAddressButton() {
		  click(factory.homePage().addnewaddressBtn);
		  logger.info("User click Add Your Address  button");
		  slowDown();
	  }
	  @Then("User click Add a credit card or Debit Card for Payment method")
	  public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		  click(factory.homePage().addPaymentBtn);
		  logger.info("User click Add a credit card or Debit Card for Payment method");
		  slowDown();
	  }
	  @Then("User fill the Debit or credit card information")
	  public void userFillTheDebitOrCreditCardInformation(io.cucumber.datatable.DataTable data) {
	      List<Map<String,String>>AddPayment=data.asMaps(String.class,String.class);
	      clearTextUsingSendKeys(factory.homePage().cardNumber);
	      sendText(factory.homePage().cardNumber,AddPayment.get(0).get("CardNumber"));
	      clearTextUsingSendKeys(factory.homePage().nameOnCard);
	      sendText(factory.homePage().nameOnCard,AddPayment.get(0).get("NameOnCard"));
	      clearTextUsingSendKeys(factory.homePage().expirationMonth);
	      sendText(factory.homePage().expirationMonth,AddPayment.get(0).get("ExpirationMonth"));
	      clearTextUsingSendKeys(factory.homePage().expirationYear);
	      sendText(factory.homePage().expirationYear,AddPayment.get(0).get("ExpirationYear"));
	      clearTextUsingSendKeys(factory.homePage().securityCode);
	      sendText(factory.homePage().securityCode,AddPayment.get(0).get("SecurityCode"));
		  logger.info("User fill the Debit or credit card information");
		  slowDown();
          
	  }
	  
//	  @And ("User click on Add your card button")
//	  public void userClickOnAddYourCardButton() {
//		  click(factory.homePage().paymentSubmitBtn);
//		  logger.info("User click on Add your card button");
//	  }
	  
	  @Then("User click on Place Your Order")
	  public void userClickOnPlaceYourOrder() {
		  waitTillClickable(factory.homePage().placeOrderBtn);
		  click(factory.homePage().placeOrderBtn);
		  logger.info("User click on Place Your Order");
		  slowDown();
	  }
	  @Then("a message should be displayed ‘Order Placed, Thanks’")
	  public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		  Assert.assertTrue(isElementDisplayed(factory.homePage().OrderPlacedthanks));
		  logger.info("a message should be displayed Order Placed, Thanks");
		  slowDown();
	  }
	
	
//	  @OrderAdded
//	  Scenario: Verify User can place an order with Shipping address and payment Method on file
	 
	  @Then("The cart icon quantity should change to {string}")
	  public void theCartIconQuantityShouldChange(String cartQuantity) {
	      Assert.assertTrue(isElementDisplayed(factory.homePage().cartQut5));
	      logger.info("the cart icon quantity should change to '5'");
	      slowDown();
	  }
	
	
	
	
	
	
	
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




