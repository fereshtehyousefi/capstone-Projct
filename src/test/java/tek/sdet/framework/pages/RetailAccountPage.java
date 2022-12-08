package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	

	
	@FindBy(id="accountLink")
	public WebElement account;
	
	
	@FindBy(id="nameInput")
    public WebElement NameField;
    
    @FindBy(id="personalPhoneInput")
    public WebElement PhoneField;
    
    @FindBy(id="personalUpdateBtn")
    public WebElement Updatebtn;
    
    @FindBy(xpath="//div[text()=\"Personal Information Updated Successfully\"]")
    public WebElement Message;
    
    @FindBy(id="previousPasswordInput")
    public WebElement PrevPassInput;
    
    @FindBy(id="newPasswordInput")
    public WebElement NewPassInput;
    
    @FindBy(id="confirmPasswordInput")
    public WebElement ConfirmPassInput;
    
    @FindBy(id="credentialsSubmitBtn")
    public WebElement ChangePassBtn;
    
    @FindBy(xpath="//div[text()=\"Password Updated Successfully\"]")
    public WebElement PassUpdatedSuccessfully;
	
//    @AddPaymentmethod
//    Scenario: Verify User can add a payment method
	
	@FindBy(xpath="//p[@class='text-sm text-blue-700 hover:underline hover:text-red-700']")
	public WebElement AddaPaymentMethod ;
	
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput ;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardInput ;
	
	@FindBy(id= "expirationMonthInput")
	public WebElement expirationMonthInput ;
	
	@FindBy(id="expirationYearInput")
	public WebElement expirationYearInput ;
	
	@FindBy(id="securityCodeInput")
	public WebElement securityCodeInput ;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement paymentSubmitBtn ;
	
	@FindBy(xpath="//div[text()=\"Payment Method added sucessfully\"]")
	public WebElement PaymentMethodupdatedSuccessfully;

  
	
	
	
//	Scenario: Verify User can edit Debit or Credit card
	
	@FindBy(xpath="//*[@class='text-blue-800 cursor-pointer hover:underline']")
	public WebElement EditOption ;
	
	@FindBy(xpath="//div[text()=\"Payment Method updated Successfully\"]")
    public WebElement paymentMethodupdatedSuccessfully;

	
	
	
	@FindBy(xpath="//button[contains(text(),'remove')]")
	public WebElement RemovePtion;
	
	
	//Scenario: Verify User can remove Debit or Credit card 
	
	
	@FindBy(xpath="//div[@class='false account__payment-item']")
	public WebElement cardPayment;
	
	
	@FindBy(xpath="//button[contains(text(),'remove')]")
	public WebElement removedCard;
	
	@FindBy(xpath="//h1[@class='account__payments-title']")
	public WebElement CardsAndAccounts;
	
	
	
	
	//@addAddress
		//  Scenario: Verify User can add an Address
	
	@FindBy(xpath="//div[@class='account__address-new']")
	public WebElement AddAddress;
	
	
		@FindBy(id="countryDropdown")
		public WebElement Country;
		
		@FindBy(id="fullNameInput")
		public WebElement FullName;
		
		@FindBy(xpath="/html/body/div/div[3]/div[2]/div/div/form/div[3]/input")
		public WebElement PhoneNumber;
		
		@FindBy(id="streetInput")
		public WebElement StreetAddress;
		
		@FindBy(id="apartmentInput")
		public WebElement ApartmentInput;
		
		@FindBy(id="cityInput")
		public WebElement CityInput;
		
		@FindBy(name ="state")
		public WebElement State;
		
		@FindBy(id="zipCodeInput")
		public WebElement ZipCode;
		@FindBy(id="addressBtn")
		public WebElement Addaddress;
		
		@FindBy(xpath="//div[text()=\"Address Added Successfully\"]")
		public WebElement AddressAddedSuccessfully;


	
	
	


	// @EditAddress
		//  Scenario: Verify User can edit an Address added on account
		@FindBy(xpath="//button[text()='Edit']")
		public WebElement EditAddress;
		
		@FindBy(id="addressBtn")
		public WebElement UpdateYourAddress;
		
		@FindBy(xpath="//div[text()=\"Address Updated Successfully\"]")
		public WebElement AddressUpdatedSuccessfully;

		

	
		//@removeOldAddress
		//  Scenario: Verify User can remove Address from Account

	@FindBy(xpath="//button[contains(text(),'Remove')]")
	public WebElement RemoveBut;

	

	
	//@removeOldAddress
	//  Scenario: Verify User can remove Address from Account
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement RemoveAddress;

	public WebElement addPaymentBttn;
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


