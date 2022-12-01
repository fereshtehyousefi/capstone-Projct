package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}

//	@FindBy(xpath = "//a[@class='top-nav__logo active']")
//	public WebElement logo;
//
//	@FindBy(id = "search")
//	public WebElement allDepartments;
//
//	@FindBy(id = "searchInput")
//	public WebElement searchInputField;
//	
//	@FindBy(id = "searchBtn")
//	public WebElement searchButton;
//	
//	@FindBy(xpath ="//img[@alt='PlayStation 5 Console']")
//	public WebElement playStationItem;
//	
//	@FindBy(xpath = "//span[text()='All']") 
//	public WebElement allElement;
//	
//	@FindBy(id="contentHeader")
//	public WebElement shopByDepartment;
//	
//	@FindBy(id="cartBtn")
//	public WebElement cart;
//
//	@FindBy(id="signinLink")
//	public WebElement signIn;
//	
//	@FindBy(id="accountLink")
//	public WebElement account;
//------------------------------------------------------------------------------------------
	
	
//	@ShopByDepartmentSidbar
//	Scenario: Verify Shop by Department sidebar
@FindBy(id="hamburgerBtn")
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





















}
