package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="orderLink")
	public WebElement orderLink;
	@FindBy(xpath="//p[@class='order__header-title']")
	public WebElement order;
	@FindBy(id="cancelBtn")
	public WebElement CancelOrder;
	@FindBy(id="reasonInput")
	public WebElement ReasonInput;
	@FindBy(xpath="//option[text()='Bought wrong item']")
	public WebElement BoughtWrongItem;
	@FindBy(id="orderSubmitBtn")
	public WebElement CancelOrderBtn;
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement MessageCanselOrder;
	
	
	
	
//	 @ReturnOrder
//	  Scenario: Verify User can Return the order
	@FindBy(id="returnBtn")
	public WebElement Return;
	@FindBy(id="dropOffInput")
	public WebElement dropOffInput;
	@FindBy(id="orderSubmitBtn")
	public WebElement ReturnBtn;
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement MessageReturn;
	
	
	
	
//	 @WrittingReview
//	  Scenario: Verify User can write a review on order placed
	
	@FindBy(id="reviewBtn")
	public WebElement reviewBtn;
	@FindBy(id="headlineInput")
	public WebElement headlineInput;
	@FindBy(id="descriptionInput")
	public WebElement descriptionInput;
	@FindBy(id="reviewSubmitBtn")
	public WebElement AddYourReview;
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement MessageReview;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
