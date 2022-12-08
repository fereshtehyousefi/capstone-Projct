package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}

	
//	@ShopByDepartmentSidbar
//	Scenario: Verify Shop by Department sidebar
@FindBy(xpath="//button[@id='hamburgerBtn']")
public WebElement AllSection;

@FindBy(id="contentHeader")
public WebElement department;
@FindBy(xpath= "//span[text()='Electronics']")
public WebElement electronics;
@FindBy(xpath= "//span[text()='Computers']")
public WebElement Computers;
@FindBy(xpath= "//span[text()='Smart Home']")
public WebElement SmartHome;
@FindBy(xpath= "//span[text()='Sports']")
public WebElement Sports;
@FindBy(xpath= "//span[text()='Automative']")
public WebElement Automative;

//------------------------------------------------------------------------------------------
//@DepartmentSidebarOpstions
//Scenario Outline: Verify department sidebar options 

@FindBy(xpath="//span[text()='TV & Video']")
public WebElement TVAndVideo;
@FindBy(xpath = "//span[text()='Video Games']")
public WebElement VideoAndGames;
@FindBy(xpath ="//span[text()='Accessories']")
public WebElement Accessories;
@FindBy(xpath= "//span[text()='Networking']")
public WebElement Networking;
@FindBy(xpath="//span[text()='Smart Home Lightning']")
public WebElement SmartHomeLightning;
@FindBy(xpath="//span[text()='Plugs and Outlets']")
public WebElement PlugsAndOutlets;
@FindBy(xpath="//span[text()='Athletic Clothing']")
public WebElement AthleticClothing;
@FindBy(xpath="//span[text()='Exercise & Fitness']")
public WebElement ExerciseAndFitness;
@FindBy(xpath="//span[text()='Automative Parts & Accessories']")
public WebElement AutomativePartsAndAccessories;
@FindBy(xpath="//span[text()='MotorCycle & Powersports']")
public WebElement MotorCycleAndPowersports;





//@additem
//Scenario: Verify User can add an item to cart
@FindBy(id="search")
public WebElement AllSearch;
@FindBy(xpath="//option[text()='Smart Home']")
public WebElement SmarthomeOption;
@FindBy(id="searchInput")
public WebElement searchInput;
@FindBy(id="searchBtn")
public WebElement searchBtn;
@FindBy(xpath="//img[@class='image']")
public WebElement Item;
@FindBy(xpath="//select[@class='product__select']")
public WebElement QYT;
@FindBy(id="addToCartBtn")
public WebElement addToCartBtn;
@FindBy(xpath="//span[text()='2']")
public WebElement cartQuantity;



//@placeAnOrder
//Scenario: Verify User can place an order without Shipping address and payment Method on file

@FindBy(id="cartBtn")
public WebElement cartBtn;
@FindBy(id="proceedBtn")
public WebElement proceedBtn;
@FindBy(id="addAddressBtn")
public WebElement addNewAddressBtn;
@FindBy(id="countryDropdown")
public WebElement countryDropdown;
@FindBy(id="fullNameInput")
public WebElement fullName;
@FindBy(id="phoneNumberInput")
public WebElement phoneNumberInput;
@FindBy(id="streetInput")
public WebElement streetInput;
@FindBy(id="apartmentInput")
public WebElement apartment;
@FindBy(id="cityInput")
public WebElement city;
@FindBy(xpath="//select[@name='state']")
public WebElement stateInput;
@FindBy(id="zipCodeInput")
public WebElement zipCodeInput;
@FindBy(id="addressBtn")
public WebElement addnewaddressBtn;
@FindBy(id="addPaymentBtn")
public WebElement addPaymentBtn;
@FindBy(id="cardNumberInput")
public WebElement cardNumber;
@FindBy(id="nameOnCardInput")
public WebElement nameOnCard;
@FindBy(id="expirationMonthInput")
public WebElement expirationMonth;
@FindBy(id="expirationYearInput")
public WebElement expirationYear;
@FindBy(id="securityCodeInput")
public WebElement securityCode;
@FindBy(id="paymentSubmitBtn")
public WebElement paymentSubmitBtn;
@FindBy(id="placeOrderBtn")
public WebElement placeOrderBtn;
@FindBy(xpath="//p[text()='Order Placed, Thanks']")
public WebElement OrderPlacedthanks;



//@OrderAdded
//Scenario: Verify User can place an order with Shipping address and payment Method on file
@FindBy(xpath="//span[text()='5']")
public WebElement cartQut5;

}
