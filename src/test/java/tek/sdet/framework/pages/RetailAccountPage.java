package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	

	
	
	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement AccountOption;
	
	
	@FindBy(id = "nameInput")
	public WebElement name;
	
	
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phone;
	
	
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement UpdateButton; 
	
	
	@FindBy(xpath = "//h1[@class='account__information-username']")
	public WebElement userNameInformation; 
	
	
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPasswordInput; 
	
	
	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordInput; 
	
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput; 
	
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement credentialsSubmitBtn; 
	
	
	
	@FindBy(xpath = "//div[@text='Password Updated Successfully']")
	public WebElement PasswordUpdatedSuccessfully; 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
