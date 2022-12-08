package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.OrderPage().orderLink);
	    logger.info("User click on Orders section");
	    slowDown();
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.OrderPage().order);
		logger.info("User click on first order in list");
		slowDown();
		}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.OrderPage().CancelOrder);
		logger.info("User click on Cancel The Order button");
		slowDown();
		}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String WrongItem) {
		sendText(factory.OrderPage().ReasonInput, WrongItem);
		logger.info("User select the cancelation Reason ");
		slowDown();
		}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.OrderPage().CancelOrderBtn);
		logger.info("User click on Cancel Order button");
		slowDown();
		}
	@Then("a cancelation message should be displayed Your Order Has Been Cancelled")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		Assert.assertTrue(isElementDisplayed(factory.OrderPage().MessageCanselOrder));
		logger.info("a cancelation message should be displayed Your Order Has Been Cancelled");
		slowDown();
		}
	
	
	
//	 @ReturnOrder
//	  Scenario: Verify User can Return the order
	
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.OrderPage().Return);
		logger.info("User click on Return Items button");
	}
	@When("User select the Return {string}")
	public void userSelectTheReturn(String reason) {
		sendText(factory.OrderPage().ReasonInput, reason);
		logger.info("User select the Return");
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String drop) {
		sendText(factory.OrderPage().dropOffInput, drop);
		logger.info("User select the drop off service ");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.OrderPage().ReturnBtn);
		logger.info("User click on Return Order button");
	}
	@Then("a cancelation message should be displayed Return was successful")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
		Assert.assertTrue(isElementDisplayed(factory.OrderPage().MessageReturn));
		logger.info("a cancelation message should be displayed Return was successful");
	}
	
	
	
//	 @WrittingReview
//	  Scenario: Verify User can write a review on order placed
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.OrderPage().reviewBtn);
	    logger.info("User click on Review button");
	    slowDown();
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String description) {
		sendText(factory.OrderPage().headlineInput, headline);
		sendText(factory.OrderPage().descriptionInput, description);
		logger.info("User write Review headline");
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.OrderPage().AddYourReview);
		logger.info("User click Add your Review button");
		slowDown();
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.OrderPage().MessageReview));
		logger.info("a review message should be displayed");
	}
	
	
	
	
	
	
	
	

}
