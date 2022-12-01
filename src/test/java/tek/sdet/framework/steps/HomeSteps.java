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
	// all your step definitions classes will extends 
	// CommonUtility class
	// we need to create object of POMFactory class
	// PomFactory instance should be on top of the class 
	POMFactory factory = new POMFactory();
	
//	@Given("User is on retail website")
//	public void userIsOnRetailWebsite() {
//	String expectedTitle = "React App";
//	String actualTitle = getTitle();// wrote this one in CommonUtility
//	Assert.assertEquals(expectedTitle, actualTitle);
//	logger.info(actualTitle +" is equal to "+ expectedTitle);
//	}
//	
//	@Then("User verify retail page logo is present")
//	public void userVerifyRetailPageLogoIsPresent() {
//	Assert.assertTrue(isElementDisplayed(factory.homePage().logo));
//	logger.info("logo is present");
//		
//	}
//	
//	@When("User change the category to {string}")
//	public void userChangeTheCategoryTo(String value) {
//		selectByVisibleText(factory.homePage().allDepartments,value);
//		logger.info(value + " was selected from the drop down");
//	    
//	}
//	@When("User search for an item {string}")
//	public void userSearchForAnItem(String value) {
//		sendText(factory.homePage().searchInputField,value);
//		logger.info("user entered "+value);
//	  
//	}
//	@When("User click on Search icon")
//	public void userClickOnSearchIcon() {
//		click(factory.homePage().searchButton);
//		logger.info("user clicked on search button");
//	}
//	@Then("Item should be present")
//	public void itemShouldBePresent() {
//		Assert.assertTrue(isElementDisplayed(factory.homePage().playStationItem));
//		logger.info("item is present");
//	    
//	}
//
//	@When("User click on All section")
//	public void userClickOnAllSection() {
//	click(factory.homePage().allElement);
//	logger.info("user clicked on All element");
//	}
//
//	@Then("User verifies {string} is present")
//	public void user_verifies_is_present(String value) {
//	String expectedValue = value;
//	String actualValue = getElementText(factory.homePage().shopByDepartment);
//	Assert.assertEquals(expectedValue, actualValue);
//	logger.info(expectedValue + " is present");
//	}
//	
//	
//	@And("User verifies cart icon is present")
//	public void userVerifiesCartIconIsPresent() {
//		slowDown();
//		HighlightElement(factory.homePage().cart);
//		slowDown();
//		Assert.assertTrue(isElementDisplayed(factory.homePage().cart));
//		logger.info("cart icon is present");
//		scrollPageDownWithJS();
//		slowDown();
//	}
//-----------------------------------------
	
//	@ShopByDepartmentSidbar
//	Scenario: Verify Shop by Department sidebar 
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	String expectedTitle = "React App";
	String actualTitle = getTitle();// wrote this one in CommonUtility
	Assert.assertEquals(expectedTitle, actualTitle);
	logger.info(actualTitle +" is equal to "+ expectedTitle);
	}
	@When ("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().AllSection);
		logger.info("User click on All section");
		
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

	
	
	@And ("User on {string}")
	public String userOnElectorincs(String department) {
		switch(department) {
		case"Electronics":
			Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
			break;
			
		case "Computers":
			Assert.assertTrue(isElementDisplayed(factory.homePage().Computers));
			break;
			
		case "Smart Home":
			Assert.assertTrue(isElementDisplayed(factory.homePage().SmartHome));
			break;
		case "Sports":
			Assert.assertTrue(isElementDisplayed(factory.homePage().Sports));
			break;
		case "Automotive":
			Assert.assertTrue(isElementDisplayed(factory.homePage().Automative));
			break;
			default:
		}
		return department;
	}
	
	  @Then("below options are present in department")
	    public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	        List<List<String>> department = dataTable.asLists();

	       switch (this.department) {
	        case "Electronics":
	            click(factory.homePage().electronics);
	            String video = getText(factory.homePage().VideoGames);
	            String TVAndVideo = getText(factory.homePage().TvAndVideo);
	            Assert.assertEquals(TVAndVideo, department.get(0).get(0));
	            Assert.assertEquals(video, department.get(0).get(1));
	            logger.info(video + " options are present in department" + TVAndVideo);
	            break;
	        case "Computers":
	            click(factory.homePage().computer);
	            String Accessories = getText(factory.homePage().Accessories);
	            String Networking = getText(factory.homePage().Networking);
	            Assert.assertEquals(Accessories, department.get(0).get(0));
	            Assert.assertEquals(Networking, department.get(0).get(1));
	            logger.info(Accessories + " options are present in department" + Networking);
	            break;
	        case "Smart Home":
	            click(factory.homePage().smarthome);
	            String SmartHomeLightning = getText(factory.homePage().smarthomelightning);
	            String PlugsandOutlets = getText(factory.homePage().plugsandoutlets);
	            Assert.assertEquals(SmartHomeLightning, department.get(0).get(0));
	            Assert.assertEquals(PlugsandOutlets, department.get(0).get(1));
	            logger.info(SmartHomeLightning + " options are present in department" + PlugsandOutlets);
	            break;
	        case "Sports":
	            click(factory.homePage().Sports);
	            String AthleticClothing = getText(factory.homePage().AthleticClothing);
	            String ExerciseFitness = getText(factory.homePage().ExerciseFitness);
	            Assert.assertEquals(AthleticClothing, department.get(0).get(0));
	            Assert.assertEquals(ExerciseFitness, department.get(0).get(1));
	            logger.info(AthleticClothing + " options are present in department" + ExerciseFitness);
	            break;
	        case "Automotive":
	            click(factory.homePage().Automative);
	            String AutomativePartsAccessories = getText(factory.homePage().AutomativePartsAccessories);
	            String MotorCyclePowersports = getText(factory.homePage().MotorCyclePowersports);
	            Assert.assertEquals(AutomativePartsAccessories, department.get(0).get(0));
	            Assert.assertEquals(MotorCyclePowersports, department.get(0).get(1));
	            logger.info(MotorCyclePowersports + " options are present in department" + AutomativePartsAccessories);
	            break; } }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




